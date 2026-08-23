package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentId;

    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private String status;

    @ManyToOne
    private patient patient;

    @ManyToOne
    private Doctor doctor;
}