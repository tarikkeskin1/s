package com.tr.pia.mhrs.web.rest;

import com.tr.pia.mhrs.repository.HospitalRepository;
import com.tr.pia.mhrs.service.HospitalService;
import com.tr.pia.mhrs.service.dto.HospitalDTO;
import com.tr.pia.mhrs.web.rest.errors.BadRequestAlertException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.PaginationUtil;
import tech.jhipster.web.util.ResponseUtil;

/**
 * REST controller for managing {@link com.tr.pia.mhrs.domain.Hospital}.
 */
@RestController
@RequestMapping("/api")
public class HospitalResource {

    private final Logger log = LoggerFactory.getLogger(HospitalResource.class);

    private static final String ENTITY_NAME = "hospital";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final HospitalService hospitalService;

    private final HospitalRepository hospitalRepository;

    public HospitalResource(HospitalService hospitalService, HospitalRepository hospitalRepository) {
        this.hospitalService = hospitalService;
        this.hospitalRepository = hospitalRepository;
    }

    /**
     * {@code POST  /hospitals} : Create a new hospital.
     *
     * @param hospitalDTO the hospitalDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new hospitalDTO, or with status {@code 400 (Bad Request)} if the hospital has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/hospitals")
    @Deprecated
    public ResponseEntity<HospitalDTO> createHospital(@RequestBody HospitalDTO hospitalDTO) throws URISyntaxException {
        log.debug("REST request to save Hospital : {}", hospitalDTO);
        if (hospitalDTO.getId() != null) {
            throw new BadRequestAlertException("A new hospital cannot already have an ID", ENTITY_NAME, "idexists");
        }
        HospitalDTO result = hospitalService.save(hospitalDTO);
        return ResponseEntity
            .created(new URI("/api/hospitals/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /hospitals/:id} : Updates an existing hospital.
     *
     * @param id the id of the hospitalDTO to save.
     * @param hospitalDTO the hospitalDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated hospitalDTO,
     * or with status {@code 400 (Bad Request)} if the hospitalDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the hospitalDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/hospitals/{id}")
    @Deprecated
    public ResponseEntity<HospitalDTO> updateHospital(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody HospitalDTO hospitalDTO
    ) throws URISyntaxException {
        log.debug("REST request to update Hospital : {}, {}", id, hospitalDTO);
        if (hospitalDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, hospitalDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!hospitalRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        HospitalDTO result = hospitalService.save(hospitalDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, hospitalDTO.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /hospitals/:id} : Partial updates given fields of an existing hospital, field will ignore if it is null
     *
     * @param id the id of the hospitalDTO to save.
     * @param hospitalDTO the hospitalDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated hospitalDTO,
     * or with status {@code 400 (Bad Request)} if the hospitalDTO is not valid,
     * or with status {@code 404 (Not Found)} if the hospitalDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the hospitalDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/hospitals/{id}", consumes = { "application/json", "application/merge-patch+json" })
    @Deprecated
    public ResponseEntity<HospitalDTO> partialUpdateHospital(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody HospitalDTO hospitalDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update Hospital partially : {}, {}", id, hospitalDTO);
        if (hospitalDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, hospitalDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!hospitalRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<HospitalDTO> result = hospitalService.partialUpdate(hospitalDTO);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, hospitalDTO.getId().toString())
        );
    }

    /**
     * {@code GET  /hospitals} : get all the hospitals.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of hospitals in body.
     */
    @GetMapping("/hospitals")
    public ResponseEntity<List<HospitalDTO>> getAllHospitals(Pageable pageable) {
        log.debug("REST request to get a page of Hospitals");
        Page<HospitalDTO> page = hospitalService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * {@code GET  /hospitals/:id} : get the "id" hospital.
     *
     * @param id the id of the hospitalDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the hospitalDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/hospitals/{id}")
    public ResponseEntity<List<HospitalDTO>>  getHospital(@PathVariable Long id) {
        log.debug("REST request to get Hospital : {}", id);
        List<HospitalDTO> hospitalDTO = hospitalService.findOne(id);
        return ResponseEntity.ok(hospitalDTO);
    }

    /**
     * {@code DELETE  /hospitals/:id} : delete the "id" hospital.
     *
     * @param id the id of the hospitalDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/hospitals/{id}")
    public ResponseEntity<Void> deleteHospital(@PathVariable Long id) {
        log.debug("REST request to delete Hospital : {}", id);
        hospitalService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, id.toString()))
            .build();
    }
}
