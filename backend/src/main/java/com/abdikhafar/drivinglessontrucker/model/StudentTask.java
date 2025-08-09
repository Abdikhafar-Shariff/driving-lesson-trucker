package com.abdikhafar.drivinglessontrucker.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity

public class StudentTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentId")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taskId")
    private Task task;

    private LocalDate startDate;


    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus = TaskStatus.NOT_STARTED;

    public StudentTask() {
    }

    public StudentTask(Long id, Student student, Task task, LocalDate startDate, TaskStatus taskStatus) {
        this.id = id;
        this.student = student;
        this.task = task;
        this.startDate = startDate;
        this.taskStatus = taskStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}

