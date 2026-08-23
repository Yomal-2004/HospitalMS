package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Doctor {
    @Id
    private String doctorId;
    private String name;
    private String qualification;
    private String specialization;
    private int contactNumber;
    private int consultationFee;
}
