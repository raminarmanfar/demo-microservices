package com.armanfar.departmentservice.controller;

import com.armanfar.departmentservice.entity.Department;
import com.armanfar.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> findAll() {
        return departmentService.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long departmentId) {
        return departmentService.findById(departmentId);
    }

    @PostMapping("/")
    public Department save(@RequestBody Department department) {
        return departmentService.save(department);
    }
}
