/*package com.abdikhafar.drivinglessontrucker.mapper;

import com.abdikhafar.drivinglessontrucker.dto.request.LoginRequestDto;
import com.abdikhafar.drivinglessontrucker.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {
    // the first thing to do is to declare the service you want to test
    private StudentMapper studentMapper;

    @BeforeEach
    void setUp() {
        studentMapper = new StudentMapper();
    }

    @Test
    public void shouldMapLoginrequestDtoToStudent(){

        LoginRequestDto loginRequestDto = new LoginRequestDto("abdi@mail.com","ddd123");

        Student student = studentMapper.toEntity(loginRequestDto);

        assertEquals(loginRequestDto.email(),student.getEmail());
        assertEquals(loginRequestDto.password(),student.getPassword());


    }

}*/