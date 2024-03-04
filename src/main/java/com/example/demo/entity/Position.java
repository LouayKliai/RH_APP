package com.example.demo.entity;

import java.io.Serializable; 
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Data
@Entity
public class Position implements Serializable   {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String positionName;
	private String description;
	@JsonBackReference
	@OneToMany(mappedBy = "position")
	private Set<Employee> employees=new HashSet<Employee>();
}
