package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ClientRepository extends JpaRepository< Client,Integer> {
}
