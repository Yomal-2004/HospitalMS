package com.example.demo.service;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;

    @Autowired
    private ModelMapper modelMapper;

    // Save Doctor
    public DoctorDTO saveDoctor(DoctorDTO doctorDTO) {

        doctorRepo.save(
                modelMapper.map(doctorDTO, Doctor.class)
        );

        return doctorDTO;
    }

    // Get All Doctors
    public List<DoctorDTO> getALLDoctors() {

        List<Doctor> doctorList = doctorRepo.findAll();

        return modelMapper.map(
                doctorList,
                new TypeToken<List<DoctorDTO>>() {}.getType()
        );
    }

    // Update Doctor
    public DoctorDTO updateDoctor(DoctorDTO doctorDTO) {

        if (doctorRepo.existsById(doctorDTO.getDoctorId())) {

            doctorRepo.save(
                    modelMapper.map(doctorDTO, Doctor.class)
            );

            return doctorDTO;
        }

        return null;
    }

    // Delete Doctor
    public boolean deleteDoctor(String doctorId) {

        if (doctorRepo.existsById(doctorId)) {

            doctorRepo.deleteById(doctorId);

            return true;
        }

        return false;
    }

    // Search Doctor
    public DoctorDTO searchDoctor(String id) {

        if (doctorRepo.existsById(id)) {

            Doctor doctor = doctorRepo.findById(id).get();

            return modelMapper.map(
                    doctor,
                    DoctorDTO.class
            );
        }

        return null;
    }
}