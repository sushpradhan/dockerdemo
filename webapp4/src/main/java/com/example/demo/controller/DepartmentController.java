package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/api/webapp4/department")
public class DepartmentController {

	@Autowired
	private Department department;
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping
	public String index() {
		return "WebApp4 Department controller accessible";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Department>> getAllDepartments() {
		
		return new ResponseEntity<List<Department>>(departmentService.getAllDepartments(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> addDepartment(@RequestBody Department department) {
		
		return new ResponseEntity<Department>(departmentService.addDepartment(department),HttpStatus.CREATED);
	}
	
	
}
