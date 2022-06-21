package com.tr.pia.mhrs.repository;

import com.tr.pia.mhrs.domain.Department;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data SQL repository for the Department entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("select d from Department d where d.hospital.id =:id")
    List<Department> findByHospitalId(@Param("id") Long id);
}
