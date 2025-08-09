package com.abdikhafar.drivinglessontrucker.repository;

import com.abdikhafar.drivinglessontrucker.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
