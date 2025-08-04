package com.abdikhafar.drivinglessontrucker.repository;

import com.abdikhafar.drivinglessontrucker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
