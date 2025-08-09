package com.abdikhafar.drivinglessontrucker.model;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

    public Task() {
    }

    public Task(Long taskId, String description, Exercise exercise, TaskStatus taskStatus) {
        this.taskId = taskId;
        this.description = description;
        this.exercise = exercise;
        this.taskStatus = taskStatus;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", description='" + description + '\'' +
                ", exercise=" + exercise +
                ", taskStatus=" + taskStatus +
                '}';
    }
}
