package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Laboratory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laboratoryId;

    private String testName;
    private String result;
    private LocalDate testDate;
    private String status;

    @ManyToOne
    private patient patient;
}
