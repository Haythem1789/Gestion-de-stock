package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Integer, Category>{
}
