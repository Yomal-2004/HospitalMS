package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Admission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer admissionId;

    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String status;

    @ManyToOne
    private patient patient;

    @ManyToOne
    private Room room;
}