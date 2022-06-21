package com.tr.pia.mhrs.service.mapper;

import com.tr.pia.mhrs.domain.Doctor;
import com.tr.pia.mhrs.service.dto.DoctorDTO;
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
public class DoctorMapperImpl implements DoctorMapper {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Doctor toEntity(DoctorDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Doctor doctor = new Doctor();

        doctor.setId( dto.getId() );
        doctor.setTitle( dto.getTitle() );
        doctor.setName( dto.getName() );
        doctor.setLastName( dto.getLastName() );
        doctor.department( departmentMapper.toEntity( dto.getDepartment() ) );

        return doctor;
    }

    @Override
    public List<Doctor> toEntity(List<DoctorDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Doctor> list = new ArrayList<Doctor>( dtoList.size() );
        for ( DoctorDTO doctorDTO : dtoList ) {
            list.add( toEntity( doctorDTO ) );
        }

        return list;
    }

    @Override
    public List<DoctorDTO> toDto(List<Doctor> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DoctorDTO> list = new ArrayList<DoctorDTO>( entityList.size() );
        for ( Doctor doctor : entityList ) {
            list.add( toDto( doctor ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Doctor entity, DoctorDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getTitle() != null ) {
            entity.setTitle( dto.getTitle() );
        }
        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getLastName() != null ) {
            entity.setLastName( dto.getLastName() );
        }
        if ( dto.getDepartment() != null ) {
            entity.department( departmentMapper.toEntity( dto.getDepartment() ) );
        }
    }

    @Override
    public DoctorDTO toDto(Doctor s) {
        if ( s == null ) {
            return null;
        }

        DoctorDTO doctorDTO = new DoctorDTO();

        doctorDTO.setDepartment( departmentMapper.toDtoId( s.getDepartment() ) );
        doctorDTO.setId( s.getId() );
        doctorDTO.setTitle( s.getTitle() );
        doctorDTO.setName( s.getName() );
        doctorDTO.setLastName( s.getLastName() );

        return doctorDTO;
    }

    @Override
    public DoctorDTO toDtoId(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }

        DoctorDTO doctorDTO = new DoctorDTO();

        doctorDTO.setId( doctor.getId() );

        return doctorDTO;
    }
}
