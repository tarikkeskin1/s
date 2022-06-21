package com.tr.pia.mhrs.service.mapper;

import com.tr.pia.mhrs.domain.Patient;
import com.tr.pia.mhrs.service.dto.PatientDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-20T22:47:38+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15 (Private Build)"
)
@Component
public class PatientMapperImpl implements PatientMapper {

    @Override
    public Patient toEntity(PatientDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Patient patient = new Patient();

        patient.setId( dto.getId() );
        patient.setFirstName( dto.getFirstName() );
        patient.setLastName( dto.getLastName() );
        patient.setEmail( dto.getEmail() );
        patient.setPhoneNumber( dto.getPhoneNumber() );
        patient.setPassword( dto.getPassword() );
        patient.setGender( dto.getGender() );

        return patient;
    }

    @Override
    public PatientDTO toDto(Patient entity) {
        if ( entity == null ) {
            return null;
        }

        PatientDTO patientDTO = new PatientDTO();

        patientDTO.setId( entity.getId() );
        patientDTO.setFirstName( entity.getFirstName() );
        patientDTO.setLastName( entity.getLastName() );
        patientDTO.setEmail( entity.getEmail() );
        patientDTO.setPhoneNumber( entity.getPhoneNumber() );
        patientDTO.setPassword( entity.getPassword() );
        patientDTO.setGender( entity.getGender() );

        return patientDTO;
    }

    @Override
    public List<Patient> toEntity(List<PatientDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Patient> list = new ArrayList<Patient>( dtoList.size() );
        for ( PatientDTO patientDTO : dtoList ) {
            list.add( toEntity( patientDTO ) );
        }

        return list;
    }

    @Override
    public List<PatientDTO> toDto(List<Patient> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PatientDTO> list = new ArrayList<PatientDTO>( entityList.size() );
        for ( Patient patient : entityList ) {
            list.add( toDto( patient ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Patient entity, PatientDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getFirstName() != null ) {
            entity.setFirstName( dto.getFirstName() );
        }
        if ( dto.getLastName() != null ) {
            entity.setLastName( dto.getLastName() );
        }
        if ( dto.getEmail() != null ) {
            entity.setEmail( dto.getEmail() );
        }
        if ( dto.getPhoneNumber() != null ) {
            entity.setPhoneNumber( dto.getPhoneNumber() );
        }
        if ( dto.getPassword() != null ) {
            entity.setPassword( dto.getPassword() );
        }
        if ( dto.getGender() != null ) {
            entity.setGender( dto.getGender() );
        }
    }

    @Override
    public PatientDTO toDtoId(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientDTO patientDTO = new PatientDTO();

        patientDTO.setId( patient.getId() );

        return patientDTO;
    }
}
