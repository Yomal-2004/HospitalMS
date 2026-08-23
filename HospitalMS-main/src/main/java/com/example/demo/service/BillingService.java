package com.example.demo.service;

import com.example.demo.entity.Billing;
import com.example.demo.repo.BillingRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    private final BillingRepo repo;

    public BillingService(BillingRepo repo) {
        this.repo = repo;
    }

    public Billing save(Billing billing) {
        return repo.save(billing);
    }

    public List<Billing> getAll() {
        return repo.findAll();
    }

    public Billing getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public Billing update(Integer id, Billing billing) {
        billing.setBillingId(id);
        return repo.save(billing);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}