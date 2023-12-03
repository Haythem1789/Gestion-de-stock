package com.jebali.gestiondestock.repository;

import com.jebali.gestiondestock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean


public interface ArticleRepository extends JpaRepository<Article,Integer > {
    Optional<Article> findArticleByCodeArticle(String codeArticle);


}
