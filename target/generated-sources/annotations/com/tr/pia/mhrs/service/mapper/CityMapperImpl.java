package com.tr.pia.mhrs.service.mapper;

import com.tr.pia.mhrs.domain.City;
import com.tr.pia.mhrs.service.dto.CityDTO;
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
public class CityMapperImpl implements CityMapper {

    @Override
    public City toEntity(CityDTO dto) {
        if ( dto == null ) {
            return null;
        }

        City city = new City();

        city.setId( dto.getId() );
        city.setName( dto.getName() );
        city.setDescription( dto.getDescription() );

        return city;
    }

    @Override
    public CityDTO toDto(City entity) {
        if ( entity == null ) {
            return null;
        }

        CityDTO cityDTO = new CityDTO();

        cityDTO.setId( entity.getId() );
        cityDTO.setName( entity.getName() );
        cityDTO.setDescription( entity.getDescription() );

        return cityDTO;
    }

    @Override
    public List<City> toEntity(List<CityDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<City> list = new ArrayList<City>( dtoList.size() );
        for ( CityDTO cityDTO : dtoList ) {
            list.add( toEntity( cityDTO ) );
        }

        return list;
    }

    @Override
    public List<CityDTO> toDto(List<City> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CityDTO> list = new ArrayList<CityDTO>( entityList.size() );
        for ( City city : entityList ) {
            list.add( toDto( city ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(City entity, CityDTO dto) {
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
    }

    @Override
    public CityDTO toDtoId(City city) {
        if ( city == null ) {
            return null;
        }

        CityDTO cityDTO = new CityDTO();

        cityDTO.setId( city.getId() );

        return cityDTO;
    }
}
