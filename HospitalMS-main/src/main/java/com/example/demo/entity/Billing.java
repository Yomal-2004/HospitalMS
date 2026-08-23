package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billingId;

    private double amount;
    private LocalDate billingDate;
    private String paymentStatus;

    @ManyToOne
    private patient patient;
}
