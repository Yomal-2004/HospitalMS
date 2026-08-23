package com.example.demo.service;

import com.example.demo.dto.DepartmentDTO;
import com.example.demo.entity.Department;
import com.example.demo.repo.DepartmentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    private final DepartmentRepo departmentRepo;

    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public List<DepartmentDTO> getAllDepartments() {
        return departmentRepo.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public DepartmentDTO getDepartmentById(Integer id) {

        Department department = departmentRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Department not found"));

        return convertToDTO(department);
    }

    public DepartmentDTO saveDepartment(DepartmentDTO dto) {

        Department department = new Department();

        department.setDepartmentName(dto.getDepartmentName());
        department.setDescription(dto.getDescription());

        Department saved = departmentRepo.save(department);

        return convertToDTO(saved);
    }

    public DepartmentDTO updateDepartment(Integer id, DepartmentDTO dto) {

        Department department = departmentRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Department not found"));

        department.setDepartmentName(dto.getDepartmentName());
        department.setDescription(dto.getDescription());

        Department updated = departmentRepo.save(department);

        return convertToDTO(updated);
    }

    public void deleteDepartment(Integer id) {

        if (!departmentRepo.existsById(id)) {
            throw new RuntimeException("Department not found");
        }

        departmentRepo.deleteById(id);
    }

    private DepartmentDTO convertToDTO(Department department) {

        return new DepartmentDTO(
                department.getDepartmentId(),
                department.getDepartmentName(),
                department.getDescription()
        );
    }
}