package com.example.demo.controller;

import com.example.demo.entity.Admission;
import com.example.demo.service.AdmissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admissions")
public class AdmissionController {

    private final AdmissionService service;

    public AdmissionController(AdmissionService service) {
        this.service = service;
    }

    @PostMapping
    public Admission save(@RequestBody Admission admission) {
        return service.save(admission);
    }

    @GetMapping
    public List<Admission> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Admission getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Admission update(@PathVariable Integer id,
                            @RequestBody Admission admission) {
        return service.update(id, admission);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}