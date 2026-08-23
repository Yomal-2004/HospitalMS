package com.example.demo.repo;

import com.example.demo.entity.Laboratory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaboratoryRepo extends JpaRepository<Laboratory, Integer> {
}