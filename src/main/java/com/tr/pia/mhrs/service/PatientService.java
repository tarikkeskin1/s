package com.tr.pia.mhrs.service;

import com.tr.pia.mhrs.service.dto.PatientDTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link com.tr.pia.mhrs.domain.Patient}.
 */
public interface PatientService {
    /**
     * Save a patient.
     *
     * @param patientDTO the entity to save.
     * @return the persisted entity.
     */
    PatientDTO save(PatientDTO patientDTO);

    /**
     * Partially updates a patient.
     *
     * @param patientDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<PatientDTO> partialUpdate(PatientDTO patientDTO);

    /**
     * Get all the patients.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<PatientDTO> findAll(Pageable pageable);

    /**
     * Get the "id" patient.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<PatientDTO> findOne(Long id);

    /**
     * Delete the "id" patient.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
