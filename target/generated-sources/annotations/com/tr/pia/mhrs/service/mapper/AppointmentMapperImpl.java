package com.tr.pia.mhrs.service.mapper;

import com.tr.pia.mhrs.domain.Appointment;
import com.tr.pia.mhrs.service.dto.AppointmentDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-20T22:47:38+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15 (Private Build)"
)
@Component
public class AppointmentMapperImpl implements AppointmentMapper {

    @Autowired
    private PatientMapper patientMapper;
    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public Appointment toEntity(AppointmentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Appointment appointment = new Appointment();

        appointment.setId( dto.getId() );
        appointment.setDate( dto.getDate() );
        appointment.patient( patientMapper.toEntity( dto.getPatient() ) );
        appointment.doctor( doctorMapper.toEntity( dto.getDoctor() ) );

        return appointment;
    }

    @Override
    public List<Appointment> toEntity(List<AppointmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Appointment> list = new ArrayList<Appointment>( dtoList.size() );
        for ( AppointmentDTO appointmentDTO : dtoList ) {
            list.add( toEntity( appointmentDTO ) );
        }

        return list;
    }

    @Override
    public List<AppointmentDTO> toDto(List<Appointment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AppointmentDTO> list = new ArrayList<AppointmentDTO>( entityList.size() );
        for ( Appointment appointment : entityList ) {
            list.add( toDto( appointment ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Appointment entity, AppointmentDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getDate() != null ) {
            entity.setDate( dto.getDate() );
        }
        if ( dto.getPatient() != null ) {
            entity.patient( patientMapper.toEntity( dto.getPatient() ) );
        }
        if ( dto.getDoctor() != null ) {
            entity.doctor( doctorMapper.toEntity( dto.getDoctor() ) );
        }
    }

    @Override
    public AppointmentDTO toDto(Appointment s) {
        if ( s == null ) {
            return null;
        }

        AppointmentDTO appointmentDTO = new AppointmentDTO();

        appointmentDTO.setPatient( patientMapper.toDtoId( s.getPatient() ) );
        appointmentDTO.setDoctor( doctorMapper.toDtoId( s.getDoctor() ) );
        appointmentDTO.setId( s.getId() );
        appointmentDTO.setDate( s.getDate() );

        return appointmentDTO;
    }
}
