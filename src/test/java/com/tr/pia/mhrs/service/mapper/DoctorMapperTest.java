package com.tr.pia.mhrs.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoctorMapperTest {

    private DoctorMapper doctorMapper;

    @BeforeEach
    public void setUp() {
        doctorMapper = new DoctorMapperImpl();
    }
}
