package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Departement;

public interface DepartementService {
	Optional<Departement> getDepartementByID(int id);
	List<Departement> gettAllDepartement();
	Departement createDepartement(Departement departement);
	Departement updateDepartement(Departement departement);
	void DeleteDepartement(int id);
	void DeleteAllDepartement();
	

}
