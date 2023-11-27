package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient> {
}
