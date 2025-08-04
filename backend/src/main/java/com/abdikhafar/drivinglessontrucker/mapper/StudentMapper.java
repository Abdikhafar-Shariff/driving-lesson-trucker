package com.abdikhafar.drivinglessontrucker.mapper;

import com.abdikhafar.drivinglessontrucker.dto.request.LoginRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.request.RegisterRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.response.LoginResponseDto;
import com.abdikhafar.drivinglessontrucker.dto.response.RegisterResponseDto;
import com.abdikhafar.drivinglessontrucker.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public Student toEntity(LoginRequestDto loginRequest){
        Student student = new Student();

        student.setEmail(loginRequest.email());
        student.setPassword(loginRequest.password());


        return student;
    }

    public LoginResponseDto responseDto(Student student){

        return new LoginResponseDto(
                student.getName(),
                student.getEmail()
        );
    }

    public List<LoginResponseDto> responseDtoList(List<Student> student){
        return student.stream()
                .map(this::responseDto)
                .collect(Collectors.toList());
    }

    public Student toEntity(RegisterRequestDto registerRequest){
        Student students = new Student();
        students.setName(registerRequest.name());
        students.setEmail(registerRequest.email());
        students.setPassword(registerRequest.password());

        return students;

    }
    public RegisterResponseDto registerResponseDto (Student students){
        return new RegisterResponseDto(
                students.getName(),
                students.getEmail()

        );
    }

}
