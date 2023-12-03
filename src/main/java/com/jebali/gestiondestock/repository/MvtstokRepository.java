package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.Mvtstok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MvtstokRepository extends JpaRepository<Integer, Mvtstok> {
}
