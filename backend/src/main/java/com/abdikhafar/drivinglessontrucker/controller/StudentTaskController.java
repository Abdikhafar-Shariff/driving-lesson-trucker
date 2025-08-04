package com.abdikhafar.drivinglessontrucker.controller;

import com.abdikhafar.drivinglessontrucker.dto.request.AssignTaskToStudentRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.response.StudentTaskResponseDto;
import com.abdikhafar.drivinglessontrucker.service.StudentTaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/studentTask")
public class StudentTaskController {
    private final StudentTaskService studentTaskService;

    public StudentTaskController(StudentTaskService studentTaskService) {
        this.studentTaskService = studentTaskService;
    }

    @PostMapping("/addStudentTask")
    public ResponseEntity<StudentTaskResponseDto> createStudentTask(@RequestBody AssignTaskToStudentRequestDto dto){
        StudentTaskResponseDto response = studentTaskService.assignTaskToStudent(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/getAllStudentTask")
    public ResponseEntity<List<StudentTaskResponseDto>> getAllStudentTask(){
        List<StudentTaskResponseDto> studentTask = studentTaskService.getAllStudentTask();
        return  ResponseEntity.ok(studentTask);
    }
}
