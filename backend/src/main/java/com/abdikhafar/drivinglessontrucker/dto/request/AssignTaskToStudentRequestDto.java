package com.abdikhafar.drivinglessontrucker.dto.request;

import java.time.LocalDate;

public record AssignTaskToStudentRequestDto(Long studentId, Long taskId, LocalDate startDate) {
}
