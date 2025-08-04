package com.abdikhafar.drivinglessontrucker.mapper;

import com.abdikhafar.drivinglessontrucker.dto.request.TaskRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.response.TaskResponseDto;
import com.abdikhafar.drivinglessontrucker.model.Exercise;
import com.abdikhafar.drivinglessontrucker.model.Task;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskMapper {
    public Task toEntity(TaskRequestDto taskRequestDto, Exercise exercise){
        Task task = new Task();
        task.setDescription(taskRequestDto.description());
        task.setTaskStatus(taskRequestDto.taskStatus());
        task.setExercise(exercise);

        return task;

    }
    public TaskResponseDto responseDto (Task task){
        return new TaskResponseDto(
                task.getDescription(),
                task.getTaskStatus()
        );
    }

    public List<TaskResponseDto> responseDtoList (List<Task> tasks){
        return tasks.stream()
                .map(this::responseDto)
                .collect(Collectors.toList());
    }
}
