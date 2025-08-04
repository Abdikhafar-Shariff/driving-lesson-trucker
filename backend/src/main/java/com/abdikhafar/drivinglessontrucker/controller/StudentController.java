package com.abdikhafar.drivinglessontrucker.controller;


import com.abdikhafar.drivinglessontrucker.dto.request.LoginRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.request.RegisterRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.response.LoginResponseDto;
import com.abdikhafar.drivinglessontrucker.dto.response.RegisterResponseDto;
import com.abdikhafar.drivinglessontrucker.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;

    }


    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> loginStudent(@RequestBody LoginRequestDto loginRequest){
        LoginResponseDto response = studentService.loginStudent(loginRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
    @GetMapping("/{id}")
    public ResponseEntity<LoginResponseDto> getStudentById(@PathVariable Long id){
        LoginResponseDto response = studentService.getStudentById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<LoginResponseDto>> getAllStudents(){
        List<LoginResponseDto> students =studentService.getAllStudent();
        return ResponseEntity.ok(students);

    }
    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDto> registerStudent(@RequestBody RegisterRequestDto registerRequest){
        RegisterResponseDto response = studentService.registerStudent(registerRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
