package com.example.demo.repo;

import com.example.demo.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepo extends JpaRepository<Billing, Integer> {
}