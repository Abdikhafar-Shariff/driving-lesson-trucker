package com.abdikhafar.drivinglessontrucker.model;

import jakarta.persistence.*;
        import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
}

