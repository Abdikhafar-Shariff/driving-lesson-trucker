package com.abdikhafar.drivinglessontrucker.repository;

import com.abdikhafar.drivinglessontrucker.model.StudentTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentTaskRepository extends JpaRepository<StudentTask,Long> {
}
