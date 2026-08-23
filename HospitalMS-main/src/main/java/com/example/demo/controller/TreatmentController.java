package com.example.demo.controller;

import com.example.demo.entity.Treatment;
import com.example.demo.service.TreatmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treatments")
public class TreatmentController {

    private final TreatmentService service;

    public TreatmentController(TreatmentService service) {
        this.service = service;
    }

    @PostMapping
    public Treatment save(@RequestBody Treatment treatment) {
        return service.save(treatment);
    }

    @GetMapping
    public List<Treatment> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Treatment getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Treatment update(@PathVariable Integer id,
                            @RequestBody Treatment treatment) {
        return service.update(id, treatment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}