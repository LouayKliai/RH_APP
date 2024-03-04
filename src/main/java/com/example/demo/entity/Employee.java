package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	 private Date dateOfBirth;
	 private String address;
	 
	 private String telephoneNumber;
	 
	 @Column(unique=true)
	 private String email;
	 private Date dateOfHire;
	 private String positionHeld;
	 @JsonManagedReference
	 @OneToOne
	 private Departement departement;
	 @JsonManagedReference
	 @OneToOne
	 private Position position;


}
