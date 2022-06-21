package com.tr.pia.mhrs.service.mapper;

import com.tr.pia.mhrs.domain.Department;
import com.tr.pia.mhrs.service.dto.DepartmentDTO;
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
public class DepartmentMapperImpl implements DepartmentMapper {

    @Autowired
    private HospitalMapper hospitalMapper;

    @Override
    public Department toEntity(DepartmentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Department department = new Department();

        department.setId( dto.getId() );
        department.setDepartmentName( dto.getDepartmentName() );
        department.setDescription( dto.getDescription() );
        department.hospital( hospitalMapper.toEntity( dto.getHospital() ) );

        return department;
    }

    @Override
    public List<Department> toEntity(List<DepartmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Department> list = new ArrayList<Department>( dtoList.size() );
        for ( DepartmentDTO departmentDTO : dtoList ) {
            list.add( toEntity( departmentDTO ) );
        }

        return list;
    }

    @Override
    public List<DepartmentDTO> toDto(List<Department> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DepartmentDTO> list = new ArrayList<DepartmentDTO>( entityList.size() );
        for ( Department department : entityList ) {
            list.add( toDto( department ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Department entity, DepartmentDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getDepartmentName() != null ) {
            entity.setDepartmentName( dto.getDepartmentName() );
        }
        if ( dto.getDescription() != null ) {
            entity.setDescription( dto.getDescription() );
        }
        if ( dto.getHospital() != null ) {
            entity.hospital( hospitalMapper.toEntity( dto.getHospital() ) );
        }
    }

    @Override
    public DepartmentDTO toDto(Department s) {
        if ( s == null ) {
            return null;
        }

        DepartmentDTO departmentDTO = new DepartmentDTO();

        departmentDTO.setHospital( hospitalMapper.toDtoId( s.getHospital() ) );
        departmentDTO.setId( s.getId() );
        departmentDTO.setDepartmentName( s.getDepartmentName() );
        departmentDTO.setDescription( s.getDescription() );

        return departmentDTO;
    }

    @Override
    public DepartmentDTO toDtoId(Department department) {
        if ( department == null ) {
            return null;
        }

        DepartmentDTO departmentDTO = new DepartmentDTO();

        departmentDTO.setId( department.getId() );

        return departmentDTO;
    }
}
