package com.example.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.model.Employee;
import com.example.restservice.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeSevice;
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getEmployyes(){
		List<Employee> resLst = employeeSevice.getEmployeeList();
		
		return ResponseEntity.ok(resLst);
		
	}

}
