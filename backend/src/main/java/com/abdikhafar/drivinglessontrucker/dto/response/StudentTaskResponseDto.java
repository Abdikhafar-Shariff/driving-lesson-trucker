package com.abdikhafar.drivinglessontrucker.dto.response;

import com.abdikhafar.drivinglessontrucker.model.TaskStatus;

import java.time.LocalDate;

public record StudentTaskResponseDto(Long studentId,
                                     Long taskId,
                                     LocalDate startDate)
{
}
