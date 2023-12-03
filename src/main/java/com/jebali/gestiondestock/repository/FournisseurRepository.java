package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface FournisseurRepository extends JpaRepository<Fournisseur,Integer > {
}
