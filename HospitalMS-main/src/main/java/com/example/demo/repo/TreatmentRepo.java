package com.example.demo.repo;

import com.example.demo.entity.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepo extends JpaRepository<Treatment, Integer> {
}
