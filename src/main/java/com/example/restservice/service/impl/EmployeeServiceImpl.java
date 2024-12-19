package com.example.restservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.model.Employee;
import com.example.restservice.repository.EmployeeRepository;
import com.example.restservice.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public List<Employee> getEmployeeList() {
		return repo.findAll();
	}

}
