package com.example.demo.service;


import com.example.demo.dto.patientDTO;
import com.example.demo.entity.patient;
import com.example.demo.repo.patientRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class patientService {
    @Autowired
    private patientRepo patientRepo;
    @Autowired
    private ModelMapper modelMapper;

    public patientDTO savePatient(patientDTO patientDTO){
        patientRepo.save(modelMapper.map(patientDTO, patient.class));
        return patientDTO;
    }

    public List<patientDTO> getALLPatients() {
        List<patient>patientList=patientRepo.findAll();
        return modelMapper.map(patientList,new TypeToken<List<patientDTO>>(){}.getType());
    }

    public patientDTO updatePatient (patientDTO patientDTO){
        patientRepo.save(modelMapper.map(patientDTO, patient.class));
        return patientDTO;
    }

    public boolean deletePatient(String patientId){
        patientRepo.deleteById(patientId);
        return true;
    }


    //Patient Searching Option

    public patientDTO searchPatient(String id){
        if(patientRepo.existsById(id)){
            patient patient = patientRepo.findById(id).get(); // get patient
            return modelMapper.map(patient, patientDTO.class);
        } else {
            return null; // or throw exception
        }
    }

}
