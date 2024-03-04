package com.example.demo.entity;

import java.io.Serializable; 

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Departement extends AuditModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String departmentName;
	private String description;
	@JsonBackReference
	@OneToMany(mappedBy = "departement")
	private Set<Employee> employees=new HashSet<Employee>();
}
