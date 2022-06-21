package com.tr.pia.mhrs.service.mapper;

import com.tr.pia.mhrs.domain.Hospital;
import com.tr.pia.mhrs.service.dto.HospitalDTO;
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
public class HospitalMapperImpl implements HospitalMapper {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public Hospital toEntity(HospitalDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Hospital hospital = new Hospital();

        hospital.setId( dto.getId() );
        hospital.setName( dto.getName() );
        hospital.setDescription( dto.getDescription() );
        hospital.city( cityMapper.toEntity( dto.getCity() ) );

        return hospital;
    }

    @Override
    public List<Hospital> toEntity(List<HospitalDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Hospital> list = new ArrayList<Hospital>( dtoList.size() );
        for ( HospitalDTO hospitalDTO : dtoList ) {
            list.add( toEntity( hospitalDTO ) );
        }

        return list;
    }

    @Override
    public List<HospitalDTO> toDto(List<Hospital> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<HospitalDTO> list = new ArrayList<HospitalDTO>( entityList.size() );
        for ( Hospital hospital : entityList ) {
            list.add( toDto( hospital ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Hospital entity, HospitalDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getDescription() != null ) {
            entity.setDescription( dto.getDescription() );
        }
        if ( dto.getCity() != null ) {
            entity.city( cityMapper.toEntity( dto.getCity() ) );
        }
    }

    @Override
    public HospitalDTO toDto(Hospital s) {
        if ( s == null ) {
            return null;
        }

        HospitalDTO hospitalDTO = new HospitalDTO();

        hospitalDTO.setCity( cityMapper.toDtoId( s.getCity() ) );
        hospitalDTO.setId( s.getId() );
        hospitalDTO.setName( s.getName() );
        hospitalDTO.setDescription( s.getDescription() );

        return hospitalDTO;
    }

    @Override
    public HospitalDTO toDtoId(Hospital hospital) {
        if ( hospital == null ) {
            return null;
        }

        HospitalDTO hospitalDTO = new HospitalDTO();

        hospitalDTO.setId( hospital.getId() );

        return hospitalDTO;
    }
}
