package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.dto.StandardResponse;
import com.example.demo.dto.patientDTO;
import com.example.demo.service.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/patient")
@CrossOrigin(origins = "*")

public class patientController {
    @Autowired
    private patientService patientService;

    @GetMapping("/getPatients")
    /*public List<patientDTO> getPatient(){
        return patientService.getALLPatients();
    }*/
    public StandardResponse getPatient(){ // Changed return type
        List<patientDTO> allPatients = patientService.getALLPatients();
        return new StandardResponse("00", "Success", allPatients);
    }

    @PostMapping("/savePatient")
    public patientDTO savePatient(@RequestBody patientDTO patientDTO){
        return patientService.savePatient(patientDTO);
    }

    @PutMapping("/updatePatient")
    public patientDTO updatePatient(@RequestBody patientDTO patientDTO){
        return patientService.updatePatient(patientDTO);
    }


    @DeleteMapping("/deletePatient/{patientId}")
    public boolean deletePatient(@PathVariable String patientId){
        return patientService.deletePatient(patientId);
    }


    //Patient Searching option

    @GetMapping("/searchPatient/{id}")
    public StandardResponse searchPatient(@PathVariable String id){
        patientDTO patientDTO = patientService.searchPatient(id);
        if(patientDTO != null){
            return new StandardResponse("00", "Patient Found", patientDTO);
        } else {
            return new StandardResponse("01", "Patient Not Found", null);
        }
    }

}



