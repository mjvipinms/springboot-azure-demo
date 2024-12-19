package com.example.restservice.service;

import java.util.List;

import com.example.restservice.model.Employee;
public interface EmployeeService {

//	public EmployeResDto addEmployee(EmployeReqDto reqDto);

	public List<Employee> getEmployeeList();
}
