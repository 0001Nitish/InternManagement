package com.example.internManagement.Enitity;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "feedbacks")
@Data
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String feedbackText;
    private LocalDate feedbackDate;

    @ManyToOne
    @JoinColumn(name = "intern_id")
    private Intern intern;
}
