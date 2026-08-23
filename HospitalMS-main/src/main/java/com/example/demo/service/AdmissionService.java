package com.example.demo.service;

import com.example.demo.entity.Admission;
import com.example.demo.repo.AdmissionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmissionService {

    private final AdmissionRepo repo;

    public AdmissionService(AdmissionRepo repo) {
        this.repo = repo;
    }

    public Admission save(Admission admission) {
        return repo.save(admission);
    }

    public List<Admission> getAll() {
        return repo.findAll();
    }

    public Admission getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public Admission update(Integer id, Admission admission) {
        admission.setAdmissionId(id);
        return repo.save(admission);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}