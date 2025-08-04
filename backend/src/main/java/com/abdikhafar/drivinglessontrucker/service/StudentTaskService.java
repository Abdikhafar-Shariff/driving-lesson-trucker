package com.abdikhafar.drivinglessontrucker.service;

import com.abdikhafar.drivinglessontrucker.dto.request.AssignTaskToStudentRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.response.StudentTaskResponseDto;
import com.abdikhafar.drivinglessontrucker.mapper.StudentTaskMapper;
import com.abdikhafar.drivinglessontrucker.model.Student;
import com.abdikhafar.drivinglessontrucker.model.StudentTask;
import com.abdikhafar.drivinglessontrucker.model.Task;
import com.abdikhafar.drivinglessontrucker.model.TaskStatus;
import com.abdikhafar.drivinglessontrucker.repository.StudentRepository;
import com.abdikhafar.drivinglessontrucker.repository.StudentTaskRepository;
import com.abdikhafar.drivinglessontrucker.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentTaskService {
    private final StudentRepository studentRepository;
    private final TaskRepository taskRepository;
    private final StudentTaskRepository studentTaskRepository;
    private StudentTaskMapper taskMapper;

    public StudentTaskService(StudentRepository studentRepository,
                              TaskRepository taskRepository,
                              StudentTaskRepository studentTaskRepository,
                              StudentTaskMapper taskMapper) {
        this.studentRepository = studentRepository;
        this.taskRepository = taskRepository;
        this.studentTaskRepository = studentTaskRepository;
        this.taskMapper = taskMapper;
    }

    public StudentTaskResponseDto assignTaskToStudent(AssignTaskToStudentRequestDto dto){

        Student student = studentRepository.findById(dto.studentId())
                .orElseThrow(() -> new IllegalArgumentException("Student not found with id: " + dto.studentId()));
        Task task = taskRepository.findById(dto.taskId())
                .orElseThrow(() -> new IllegalArgumentException("Task not found with id: " + dto.taskId()));

        // Create new StudentTask
        StudentTask studentTask = new StudentTask();
        studentTask.setStudent(student);
        studentTask.setTask(task);
        studentTask.setStartDate(dto.startDate());

        // Save and return
        StudentTask saved = studentTaskRepository.save(studentTask);
        return taskMapper.responseDto(saved);
    }

    public List<StudentTaskResponseDto> getAllStudentTask(){
        List<StudentTask> studentTasks = studentTaskRepository.findAll();
        return taskMapper.responseDtoList(studentTasks);

    }
}
