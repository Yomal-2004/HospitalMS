package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer treatmentId;

    private String treatmentName;
    private String description;
    private LocalDate treatmentDate;

    @ManyToOne
    private patient patient;

    @ManyToOne
    private Doctor doctor;
}
