package com.jebali.gestiondestock.controller;

import com.jebali.gestiondestock.controller.api.ArticleApi;
import com.jebali.gestiondestock.dto.ArticleDto;
import com.jebali.gestiondestock.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController implements ArticleApi {

    //constructeur injection
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    //field injection
    @Autowired
    private ArticleService articleService;


    @Override
    public ArticleDto save(ArticleDto dto) {
        return null;
    }

    @Override
    public ArticleDto findById(Integer id) {
        return null;
    }

    @Override
    public ArticleDto findByCodeArticle(String codeArticle) {
        return null;
    }

    @Override
    public List<ArticleDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
