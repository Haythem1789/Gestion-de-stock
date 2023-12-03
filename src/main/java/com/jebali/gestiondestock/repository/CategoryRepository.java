package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CategoryRepository extends JpaRepository<Category,Integer>{
}
