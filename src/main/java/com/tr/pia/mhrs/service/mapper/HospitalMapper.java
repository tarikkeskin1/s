package com.tr.pia.mhrs.service.mapper;

import com.tr.pia.mhrs.domain.Hospital;
import com.tr.pia.mhrs.service.dto.HospitalDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Hospital} and its DTO {@link HospitalDTO}.
 */
@Mapper(componentModel = "spring", uses = { CityMapper.class })
public interface HospitalMapper extends EntityMapper<HospitalDTO, Hospital> {
    @Mapping(target = "city", source = "city", qualifiedByName = "id")
    HospitalDTO toDto(Hospital s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    HospitalDTO toDtoId(Hospital hospital);
}
