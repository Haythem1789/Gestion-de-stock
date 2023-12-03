package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface VentesRepository extends JpaRepository<Integer, Ventes> {
}
