package com.example.internManagement.Enitity;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "interns")
@Data
public class Intern {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactInformation;
    private String department;
    private LocalDate startDate;
    private LocalDate endDate;

}
