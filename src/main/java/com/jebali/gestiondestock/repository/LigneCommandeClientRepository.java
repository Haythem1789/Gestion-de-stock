package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface LigneCommandeClientRepository extends JpaRepository<Integer, LigneCommandeClient> {
}
