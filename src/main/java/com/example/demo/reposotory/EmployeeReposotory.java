package com.example.demo.reposotory;
import java.util.List; 
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Position;

import java.util.Date;



public interface EmployeeReposotory extends JpaRepository<Employee, Long> {
   Optional<List<Employee>> findByNom(String nom);
    List<Employee> findAll();
   Optional<Employee> findById(long id);
   Optional<List<Employee>> findByAdresse(String adresse);
   Optional<List<Employee>> findByDateEmbauche(Date dateEmbauche);
   Optional<List<Employee>> findByNumeroTelephone(String numeroTelephone);
   Optional<List<Employee>> findByPoste(Position poste);
}
    	

