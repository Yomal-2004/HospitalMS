package com.example.demo.controller;

import com.example.demo.entity.Billing;
import com.example.demo.service.BillingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/billings")
public class BillingController {

    private final BillingService service;

    public BillingController(BillingService service) {
        this.service = service;
    }

    @PostMapping
    public Billing save(@RequestBody Billing billing) {
        return service.save(billing);
    }

    @GetMapping
    public List<Billing> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Billing getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Billing update(@PathVariable Integer id,
                          @RequestBody Billing billing) {
        return service.update(id, billing);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}