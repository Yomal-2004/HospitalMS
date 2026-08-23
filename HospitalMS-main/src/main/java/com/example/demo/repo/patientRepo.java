package com.example.demo.repo;

import com.example.demo.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientRepo extends JpaRepository<patient, String> {
}
