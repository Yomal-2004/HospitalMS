package com.example.demo.controller;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@CrossOrigin
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // Save Doctor
    @PostMapping("/save")
    public DoctorDTO saveDoctor(@RequestBody DoctorDTO doctorDTO) {
        return doctorService.saveDoctor(doctorDTO);
    }

    // Get All Doctors
    @GetMapping("/getAll")
    public List<DoctorDTO> getAllDoctors() {
        return doctorService.getALLDoctors();
    }

    // Update Doctor
    @PutMapping("/update")
    public DoctorDTO updateDoctor(@RequestBody DoctorDTO doctorDTO) {
        return doctorService.updateDoctor(doctorDTO);
    }

    // Delete Doctor
    @DeleteMapping("/delete/{id}")
    public boolean deleteDoctor(@PathVariable String id) {
        return doctorService.deleteDoctor(id);
    }

    // Search Doctor
    @GetMapping("/search/{id}")
    public DoctorDTO searchDoctor(@PathVariable String id) {
        return doctorService.searchDoctor(id);
    }
}