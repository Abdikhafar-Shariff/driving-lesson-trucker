package com.abdikhafar.drivinglessontrucker.dto.response;

import com.abdikhafar.drivinglessontrucker.dto.request.TaskRequestDto;
import com.abdikhafar.drivinglessontrucker.model.Task;

import java.util.List;

public record ExerciseResponseDto(String title, List<TaskResponseDto> task) { }
