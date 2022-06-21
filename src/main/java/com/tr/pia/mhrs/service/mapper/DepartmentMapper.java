package com.tr.pia.mhrs.service.mapper;

import com.tr.pia.mhrs.domain.Department;
import com.tr.pia.mhrs.service.dto.DepartmentDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Department} and its DTO {@link DepartmentDTO}.
 */
@Mapper(componentModel = "spring", uses = { HospitalMapper.class })
public interface DepartmentMapper extends EntityMapper<DepartmentDTO, Department> {
    @Mapping(target = "hospital", source = "hospital", qualifiedByName = "id")
    DepartmentDTO toDto(Department s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DepartmentDTO toDtoId(Department department);
}
