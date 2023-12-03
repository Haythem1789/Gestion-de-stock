package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.LigneCommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface LigneCommandeFournisseurRepository extends JpaRepository<Integer, LigneCommandeFournisseur> {
}
