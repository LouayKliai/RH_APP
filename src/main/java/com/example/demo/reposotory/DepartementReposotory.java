package com.example.demo.reposotory;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Departement;

public interface DepartementReposotory extends JpaRepository<Departement, Integer> {
 Optional<Departement> findByNomDepartement(String nomDepartement);
 Optional<Departement> findById(Departement dep) ;
 Optional<Departement> findByDescription(String description);
}
