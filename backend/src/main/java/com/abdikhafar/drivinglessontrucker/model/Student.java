package com.abdikhafar.drivinglessontrucker.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;




@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentTask> studentTasks = new ArrayList<>();

    public Student() {
    }

    public Student(Long studentId, String name, String email, String password, List<StudentTask> studentTasks) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.studentTasks = studentTasks;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<StudentTask> getStudentTasks() {
        return studentTasks;
    }

    public void setStudentTasks(List<StudentTask> studentTasks) {
        this.studentTasks = studentTasks;
    }
}
