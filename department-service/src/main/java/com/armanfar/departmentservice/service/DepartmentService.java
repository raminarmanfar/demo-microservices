package com.armanfar.departmentservice.service;

import com.armanfar.departmentservice.entity.Department;
import com.armanfar.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    public Department findById(Long departmentId) {
        return departmentRepository.findById(departmentId).orElse(null);
    }

    public Department save(Department department) {
        return departmentRepository.save(department);
    }
}
