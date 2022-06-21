package com.tr.pia.mhrs.repository;

import com.tr.pia.mhrs.domain.Hospital;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data SQL repository for the Hospital entity.
 */
@SuppressWarnings("unused")
@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {


    @Query("select h from Hospital h where h.city.id =:id")
    List<Hospital> findByCityId(@Param("id")Long id);
}
