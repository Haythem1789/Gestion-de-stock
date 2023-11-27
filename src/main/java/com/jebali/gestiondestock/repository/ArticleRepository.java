package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Integer, Article> {


}
