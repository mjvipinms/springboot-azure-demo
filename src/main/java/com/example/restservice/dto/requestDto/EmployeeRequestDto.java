package com.example.restservice.dto.requestDto;

import java.sql.Date;
import java.util.Objects;

public class EmployeeRequestDto {
	private String employeeFirstName;
	private String employeeMiddleName;
	private String employeeLastName;
	private Date employeeDob;
	private String employeeMob;
	private String employeeMail;
	private String employeeCode;
	private String employeeAddressLine1;
	private String employeeAddressLine2;
	private Integer departmentId;
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeMiddleName() {
		return employeeMiddleName;
	}
	public void setEmployeeMiddleName(String employeeMiddleName) {
		this.employeeMiddleName = employeeMiddleName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public Date getEmployeeDob() {
		return employeeDob;
	}
	public void setEmployeeDob(Date employeeDob) {
		this.employeeDob = employeeDob;
	}
	public String getEmployeeMob() {
		return employeeMob;
	}
	public void setEmployeeMob(String employeeMob) {
		this.employeeMob = employeeMob;
	}
	public String getEmployeeMail() {
		return employeeMail;
	}
	public void setEmployeeMail(String employeeMail) {
		this.employeeMail = employeeMail;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeAddressLine1() {
		return employeeAddressLine1;
	}
	public void setEmployeeAddressLine1(String employeeAddressLine1) {
		this.employeeAddressLine1 = employeeAddressLine1;
	}
	public String getEmployeeAddressLine2() {
		return employeeAddressLine2;
	}
	public void setEmployeeAddressLine2(String employeeAddressLine2) {
		this.employeeAddressLine2 = employeeAddressLine2;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(departmentId, employeeAddressLine1, employeeAddressLine2, employeeCode, employeeDob,
				employeeFirstName, employeeLastName, employeeMail, employeeMiddleName, employeeMob);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeRequestDto other = (EmployeeRequestDto) obj;
		return Objects.equals(departmentId, other.departmentId)
				&& Objects.equals(employeeAddressLine1, other.employeeAddressLine1)
				&& Objects.equals(employeeAddressLine2, other.employeeAddressLine2)
				&& Objects.equals(employeeCode, other.employeeCode) && Objects.equals(employeeDob, other.employeeDob)
				&& Objects.equals(employeeFirstName, other.employeeFirstName)
				&& Objects.equals(employeeLastName, other.employeeLastName)
				&& Objects.equals(employeeMail, other.employeeMail)
				&& Objects.equals(employeeMiddleName, other.employeeMiddleName)
				&& Objects.equals(employeeMob, other.employeeMob);
	}
	@Override
	public String toString() {
		return "EmployeeRequestDto [employeeFirstName=" + employeeFirstName + ", employeeMiddleName="
				+ employeeMiddleName + ", employeeLastName=" + employeeLastName + ", employeeDob=" + employeeDob
				+ ", employeeMob=" + employeeMob + ", employeeMail=" + employeeMail + ", employeeCode=" + employeeCode
				+ ", employeeAddressLine1=" + employeeAddressLine1 + ", employeeAddressLine2=" + employeeAddressLine2
				+ ", departmentId=" + departmentId + "]";
	}
	
	
	
}
