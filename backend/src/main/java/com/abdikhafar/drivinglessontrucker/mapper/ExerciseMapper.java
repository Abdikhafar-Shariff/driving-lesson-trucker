package com.abdikhafar.drivinglessontrucker.mapper;

import com.abdikhafar.drivinglessontrucker.dto.request.ExerciseRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.response.ExerciseResponseDto;
import com.abdikhafar.drivinglessontrucker.dto.response.TaskResponseDto;
import com.abdikhafar.drivinglessontrucker.model.Exercise;
import com.abdikhafar.drivinglessontrucker.model.Task;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExerciseMapper {

    public Exercise toEntity (ExerciseRequestDto exerciseRequestDto){

        Exercise exercise = new Exercise();
        exercise.setTitle(exerciseRequestDto.title());
        List<Task> tasks = new ArrayList<>();

        if (exerciseRequestDto.task() != null) {
            tasks = exerciseRequestDto.task().stream()
                    .map(taskDto -> {
                        Task task = new Task();
                        task.setDescription(taskDto.description());
                        task.setTaskStatus(taskDto.taskStatus());
                        task.setExercise(exercise);
                        return task;
                    })
                    .collect(Collectors.toList());
        }

        exercise.setTasks(tasks);
        return exercise;
    }
    public ExerciseResponseDto responseDto(Exercise exercise){

        List<TaskResponseDto> taskResponseDtos = exercise.getTasks().stream()
                .map(task -> new TaskResponseDto(
                        task.getDescription(),
                        task.getTaskStatus()
                ))
                .collect(Collectors.toList());
        return new  ExerciseResponseDto(
                exercise.getTitle(),
                taskResponseDtos
        );
    }

    public List<ExerciseResponseDto> requestDtoList(List<Exercise> exercise){
        return exercise.stream()
                .map(this::responseDto)
                .collect(Collectors.toList());
    }
}
