package com.tr.pia.mhrs.service;

import com.tr.pia.mhrs.service.dto.HospitalDTO;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link com.tr.pia.mhrs.domain.Hospital}.
 */
public interface HospitalService {
    /**
     * Save a hospital.
     *
     * @param hospitalDTO the entity to save.
     * @return the persisted entity.
     */
    HospitalDTO save(HospitalDTO hospitalDTO);

    /**
     * Partially updates a hospital.
     *
     * @param hospitalDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<HospitalDTO> partialUpdate(HospitalDTO hospitalDTO);

    /**
     * Get all the hospitals.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<HospitalDTO> findAll(Pageable pageable);

    /**
     * Get the "id" hospital.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    List<HospitalDTO> findOne(Long id);

    /**
     * Delete the "id" hospital.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
