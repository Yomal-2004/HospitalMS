package com.example.demo.service;

import com.example.demo.entity.Treatment;
import com.example.demo.repo.TreatmentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentService {

    private final TreatmentRepo repo;

    public TreatmentService(TreatmentRepo repo) {
        this.repo = repo;
    }

    public Treatment save(Treatment treatment) {
        return repo.save(treatment);
    }

    public List<Treatment> getAll() {
        return repo.findAll();
    }

    public Treatment getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public Treatment update(Integer id, Treatment treatment) {
        treatment.setTreatmentId(id);
        return repo.save(treatment);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}