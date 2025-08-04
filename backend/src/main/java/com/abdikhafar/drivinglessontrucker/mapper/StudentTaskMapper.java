package com.abdikhafar.drivinglessontrucker.mapper;

import com.abdikhafar.drivinglessontrucker.dto.request.AssignTaskToStudentRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.response.StudentTaskResponseDto;
import com.abdikhafar.drivinglessontrucker.model.StudentTask;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentTaskMapper {

    public StudentTaskResponseDto responseDto(StudentTask studentTask){
        return  new StudentTaskResponseDto(
                studentTask.getStudent().getStudentId(),
                studentTask.getTask().getTaskId(),
                studentTask.getStartDate()
        );
    }

    public List<StudentTaskResponseDto> responseDtoList (List<StudentTask> studentTasks){
        return studentTasks.stream()
                .map(this::responseDto)
                .collect(Collectors.toList());
    }
}
