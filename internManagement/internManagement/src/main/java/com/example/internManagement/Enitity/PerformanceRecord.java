package com.example.internManagement.Enitity;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "performance_records")
@Data
public class PerformanceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String metrics;
    private LocalDate recordDate;

    @ManyToOne
    @JoinColumn(name = "intern_id")
    private Intern intern;
}
