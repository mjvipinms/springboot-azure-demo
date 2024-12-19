package com.example.restservice.mapper;

import org.mapstruct.Mapper;

import com.example.restservice.dto.requestDto.EmployeeRequestDto;
import com.example.restservice.dto.responseDto.EmployeeResponseDto;
import com.example.restservice.model.Employee;

@Mapper
public interface RequestResponseMapper {
	EmployeeResponseDto convertToResponse(Employee employee);

	Employee convertToEmployee(EmployeeRequestDto requestDto);
}
