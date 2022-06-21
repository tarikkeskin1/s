package com.tr.pia.mhrs.service.mapper;

import com.tr.pia.mhrs.domain.Doctor;
import com.tr.pia.mhrs.service.dto.DoctorDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Doctor} and its DTO {@link DoctorDTO}.
 */
@Mapper(componentModel = "spring", uses = { DepartmentMapper.class })
public interface DoctorMapper extends EntityMapper<DoctorDTO, Doctor> {
    @Mapping(target = "department", source = "department", qualifiedByName = "id")
    DoctorDTO toDto(Doctor s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DoctorDTO toDtoId(Doctor doctor);
}
