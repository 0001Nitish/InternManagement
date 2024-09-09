package com.example.internManagement.Enitity;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private LocalDate dueDate;
    private String priority;

    @ManyToOne
    @JoinColumn(name = "intern_id")
    private Intern intern;
}
