package com.abdikhafar.drivinglessontrucker.service;

import com.abdikhafar.drivinglessontrucker.dto.request.LoginRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.request.RegisterRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.response.LoginResponseDto;
import com.abdikhafar.drivinglessontrucker.dto.response.RegisterResponseDto;
import com.abdikhafar.drivinglessontrucker.mapper.StudentMapper;
import com.abdikhafar.drivinglessontrucker.model.Student;
import com.abdikhafar.drivinglessontrucker.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public LoginResponseDto loginStudent(LoginRequestDto loginRequest){
        Student student = studentMapper.toEntity(loginRequest);
        student = studentRepository.save(student);
        return studentMapper.responseDto(student);

    }

    public LoginResponseDto getStudentById(Long id){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        return studentMapper.responseDto(student);
    }

    public List<LoginResponseDto> getAllStudent(){
        List<Student> students = studentRepository.findAll();
        return studentMapper.responseDtoList(students);


    }

    public RegisterResponseDto registerStudent(RegisterRequestDto registerRequest){
        Student students = studentMapper.toEntity(registerRequest);
        students = studentRepository.save(students);
        return studentMapper.registerResponseDto(students);
    }
}
