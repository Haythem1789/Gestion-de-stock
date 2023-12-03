package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommandeClientRepository extends JpaRepository<CommandeClient,Integer> {
}
