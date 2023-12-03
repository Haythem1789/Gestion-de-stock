package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface EntrepriseRepository extends JpaRepository<Entreprise,Integer > {
}
