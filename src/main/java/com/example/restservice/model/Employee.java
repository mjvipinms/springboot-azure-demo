package com.example.restservice.model;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String employeeFirstName;
    private String employeeMiddleName;
    private String employeeLastName;
    private Date employeeDob;
    private String employeeMob;
    private String employeeMail;
    private String employeeCode;
    private String employeeAddressLine1;
    private String employeeAddressLine2;
    @ManyToOne()
    @JoinColumn(name = "department_id")
    private Departments department;
    
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
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
	@Override
	public int hashCode() {
		return Objects.hash(department, employeeAddressLine1, employeeAddressLine2, employeeCode, employeeDob,
				employeeFirstName, employeeId, employeeLastName, employeeMail, employeeMiddleName, employeeMob);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department)
				&& Objects.equals(employeeAddressLine1, other.employeeAddressLine1)
				&& Objects.equals(employeeAddressLine2, other.employeeAddressLine2)
				&& Objects.equals(employeeCode, other.employeeCode) && Objects.equals(employeeDob, other.employeeDob)
				&& Objects.equals(employeeFirstName, other.employeeFirstName)
				&& Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(employeeLastName, other.employeeLastName)
				&& Objects.equals(employeeMail, other.employeeMail)
				&& Objects.equals(employeeMiddleName, other.employeeMiddleName)
				&& Objects.equals(employeeMob, other.employeeMob);
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName
				+ ", employeeMiddleName=" + employeeMiddleName + ", employeeLastName=" + employeeLastName
				+ ", employeeDob=" + employeeDob + ", employeeMob=" + employeeMob + ", employeeMail=" + employeeMail
				+ ", employeeCode=" + employeeCode + ", employeeAddressLine1=" + employeeAddressLine1
				+ ", employeeAddressLine2=" + employeeAddressLine2 + ", department=" + department + "]";
	}
    
    
    
}
