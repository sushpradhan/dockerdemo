package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Department;

public interface DepartmentService {

	public List<Department> getAllDepartments();
	public Department addDepartment(Department department);
	
	
	
}
