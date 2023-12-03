package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UtilisateurRepository extends JpaRepository<Integer, Utilisateur> {
}
