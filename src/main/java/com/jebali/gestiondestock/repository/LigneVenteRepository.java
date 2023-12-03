package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface LigneVenteRepository extends JpaRepository<Integer, LigneVente> {
}
