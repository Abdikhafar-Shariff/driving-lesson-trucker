package com.abdikhafar.drivinglessontrucker.dto.request;

import com.abdikhafar.drivinglessontrucker.model.Task;

import java.util.List;

public record ExerciseRequestDto(String title, List<TaskRequestDto> task) { }
