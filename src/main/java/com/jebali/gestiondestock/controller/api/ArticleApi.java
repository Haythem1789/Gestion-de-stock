package com.jebali.gestiondestock.controller.api;

import com.jebali.gestiondestock.dto.ArticleDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static com.jebali.gestiondestock.utils.constants.APP_ROUTE;

import java.util.List;

public interface ArticleApi {

    @PostMapping(value = APP_ROUTE + "/article/creation", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto save(@RequestBody ArticleDto dto);

    @GetMapping(value = APP_ROUTE + "/article/{idarticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findById(@PathVariable("idarticle") Integer id);

    @GetMapping(value = APP_ROUTE + "/article/{codeArticle}",produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findByCodeArticle(@PathVariable String codeArticle);

    @GetMapping(value = APP_ROUTE + "/article/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticleDto> findAll();

    @DeleteMapping(value = APP_ROUTE + "/article/delet/{idArticle}")
    void delete(@PathVariable("idArticle") Integer id);

}
