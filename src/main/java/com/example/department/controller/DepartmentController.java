package com.example.department.controller;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;
import com.example.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DepartmentRepository departmentRepository;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside saveDepartment method in departmentController");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable Long id){
        log.info("inside findDepartmentById method in departmentController");
        return departmentService.findDepartmentById(id);

    }
    @GetMapping("/get")
    public List<Department> getAllDepartment(){
        log.info("inside findDepartmentById method in departmentController");
        return departmentRepository.findAll();

    }
}
