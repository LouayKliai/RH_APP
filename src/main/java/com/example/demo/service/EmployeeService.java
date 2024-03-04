package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	void deleteEmployee(int id);
	void deleteAllEmployee();
	Employee createEmployee(Employee emp);
	Optional<Employee> getEmployeeByID(int id);
	List<Employee> getAllEmployee();

}
