package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean

public interface RolesRepository extends JpaRepository<Integer, Roles> {
}
