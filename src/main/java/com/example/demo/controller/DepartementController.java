package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Departement;
import com.example.demo.service.DepartementService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/departements")
public class DepartementController {
	
	@Autowired
	DepartementService departementService;
	
@GetMapping("/allDepartement")
public List<Departement> getAllDepartement(){
	return departementService.gettAllDepartement();
}
@GetMapping("/{id}")
public Optional<Departement> getDepartementByID(@PathParam(value = "id") int id) {
	return departementService.getDepartementByID(id);
}
@PostMapping
public Departement createDepartement(@RequestBody Departement departement) {
	return departementService.createDepartement(departement);
}

@PutMapping("/{id}")
public Departement udateDepartement(@PathVariable int id,@RequestBody Departement departement) {
	return departementService.updateDepartement(departement);
}

@DeleteMapping
public void deleteAllDepartement() {
	departementService.DeleteAllDepartement();
}
@DeleteMapping
public void deleteDepartementByID(@PathParam(value = "id") int id) {
	departementService.DeleteDepartement(id);
}
	
}
