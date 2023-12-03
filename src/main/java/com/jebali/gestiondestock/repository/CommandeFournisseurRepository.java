package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommandeFournisseurRepository extends JpaRepository< CommandeFournisseur,Integer> {
}
