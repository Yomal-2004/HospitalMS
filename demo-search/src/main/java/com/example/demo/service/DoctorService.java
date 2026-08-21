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

public class DoctorService{
    @Autowired
    private DoctorRepo doctorRepo;
    @Autowired
    private ModelMapper modelMapper;

    public DoctorDTO saveDoctor(DoctorDTO doctorDTO) {
        doctorRepo.save(modelMapper.map(doctorDTO, Doctor.class));
        return doctorDTO;
    }

    public List<DoctorDTO> getALLDoctors(){
        List<Doctor> DoctorList = doctorRepo.findAll();
        return modelMapper.map(DoctorList,new TypeToken<List<DoctorDTO>>(){}.getType());
    }

    public DoctorDTO updateDoctor(DoctorDTO doctorDTO){
        //doctorDTO.save(modelMapper.map(doctorDTO,Doctor.class));
        return doctorDTO;
    }

    public boolean deleteDoctor(String DoctorId){
        doctorRepo.deleteById(DoctorId);
        return true;
    }

    public DoctorDTO searchDoctor(String id){
        if(doctorRepo.existsById(id)) {
           // Doctor doctor = doctorRepo.findAll(id).get();
          //  return modelMapper.map(doctor, DoctorDTO.class);
        }else {
            return null;
        }
        return null;
    }
}