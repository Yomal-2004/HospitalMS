package com.example.demo.repo;

import com.example.demo.entity.Admission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionRepo extends JpaRepository<Admission, Integer> {
}