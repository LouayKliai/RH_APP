package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Departement;
import com.example.demo.reposotory.DepartementReposotory;

public class DepartementServiceImpl implements DepartementService{
	@Autowired
	DepartementReposotory depRep;

	@Override
	public Optional<Departement> getDepartementByID(int id) {		
		return depRep.findById(id);
	}

	@Override
	public List<Departement> gettAllDepartement() {		
		return depRep.findAll();
	}

	@Override
	public Departement createDepartement(Departement departement) {		
		return depRep.save(departement);
	}

	@Override
	public Departement updateDepartement(Departement departement) {
		return depRep.saveAndFlush(departement);
	}

	@Override
	public void DeleteDepartement(int id) {
		depRep.deleteById(id);
		
	}

	@Override
	public void DeleteAllDepartement() {
		depRep.deleteAll();
		
	}

}
