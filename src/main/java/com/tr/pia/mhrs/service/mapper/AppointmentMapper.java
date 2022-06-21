package com.tr.pia.mhrs.service.mapper;

import com.tr.pia.mhrs.domain.Appointment;
import com.tr.pia.mhrs.service.dto.AppointmentDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Appointment} and its DTO {@link AppointmentDTO}.
 */
@Mapper(componentModel = "spring", uses = { PatientMapper.class, DoctorMapper.class })
public interface AppointmentMapper extends EntityMapper<AppointmentDTO, Appointment> {
    @Mapping(target = "patient", source = "patient", qualifiedByName = "id")
    @Mapping(target = "doctor", source = "doctor", qualifiedByName = "id")
    AppointmentDTO toDto(Appointment s);
}
