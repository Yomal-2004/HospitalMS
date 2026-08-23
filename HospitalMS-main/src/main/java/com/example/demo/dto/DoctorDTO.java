package com.example.demo.dto;


import com.example.demo.entity.Doctor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class DoctorDTO {
    private String doctorId;
    private String name;
    private String qualification;
    private String specialization;
    private int contactNumber;
    private int consultationFee;

}
