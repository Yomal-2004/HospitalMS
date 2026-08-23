package com.example.demo.service;

import com.example.demo.entity.Laboratory;
import com.example.demo.repo.LaboratoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaboratoryService {

    private final LaboratoryRepo repo;

    public LaboratoryService(LaboratoryRepo repo) {
        this.repo = repo;
    }

    public Laboratory save(Laboratory laboratory) {
        return repo.save(laboratory);
    }

    public List<Laboratory> getAll() {
        return repo.findAll();
    }

    public Laboratory getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public Laboratory update(Integer id, Laboratory laboratory) {
        laboratory.setLaboratoryId(id);
        return repo.save(laboratory);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}