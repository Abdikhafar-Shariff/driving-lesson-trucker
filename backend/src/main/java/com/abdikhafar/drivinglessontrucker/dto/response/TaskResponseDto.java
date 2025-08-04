package com.abdikhafar.drivinglessontrucker.dto.response;

import com.abdikhafar.drivinglessontrucker.model.Exercise;
import com.abdikhafar.drivinglessontrucker.model.TaskStatus;

public record TaskResponseDto(String description, TaskStatus status) { }
