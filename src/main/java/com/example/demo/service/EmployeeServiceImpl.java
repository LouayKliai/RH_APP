package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Employee;
import com.example.demo.reposotory.EmployeeReposotory;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeReposotory emplRep;
	
	@Override
	public void deleteEmployee(int id) {
		emplRep.deleteById((long) id);
		
	}

	@Override
	public void deleteAllEmployee() {
		emplRep.deleteAll();
		
	}

	@Override
	public Employee createEmployee(Employee emp) {		
		return emplRep.save(emp);
	}

	@Override
	public Optional<Employee> getEmployeeByID(int id) {
		return emplRep.findById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {		
		return emplRep.findAll();
	}

}
