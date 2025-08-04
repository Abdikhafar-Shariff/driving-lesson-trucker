package com.abdikhafar.drivinglessontrucker.dto.request;

import com.abdikhafar.drivinglessontrucker.model.Exercise;
import com.abdikhafar.drivinglessontrucker.model.TaskStatus;

public record TaskRequestDto(String description, TaskStatus taskStatus) { }
