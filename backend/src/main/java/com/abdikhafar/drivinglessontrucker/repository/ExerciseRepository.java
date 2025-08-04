package com.abdikhafar.drivinglessontrucker.repository;

import com.abdikhafar.drivinglessontrucker.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise,Long> {
}
