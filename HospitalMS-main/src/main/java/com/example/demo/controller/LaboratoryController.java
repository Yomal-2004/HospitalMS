package com.example.demo.controller;

import com.example.demo.entity.Laboratory;
import com.example.demo.service.LaboratoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laboratories")
public class LaboratoryController {

    private final LaboratoryService service;

    public LaboratoryController(LaboratoryService service) {
        this.service = service;
    }

    @PostMapping
    public Laboratory save(@RequestBody Laboratory laboratory) {
        return service.save(laboratory);
    }

    @GetMapping
    public List<Laboratory> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Laboratory getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Laboratory update(@PathVariable Integer id,
                             @RequestBody Laboratory laboratory) {
        return service.update(id, laboratory);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}