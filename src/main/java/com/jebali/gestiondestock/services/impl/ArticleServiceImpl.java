package com.jebali.gestiondestock.services.impl;

import com.jebali.gestiondestock.dto.ArticleDto;
import com.jebali.gestiondestock.exception.EntityNotFoundException;
import com.jebali.gestiondestock.exception.ErrorCodes;
import com.jebali.gestiondestock.exception.invalidEntityException;
import com.jebali.gestiondestock.model.Article;
import com.jebali.gestiondestock.repository.ArticleRepository;
import com.jebali.gestiondestock.services.ArticleService;
import com.jebali.gestiondestock.validator.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {


    @Autowired
    private ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public ArticleDto save(ArticleDto articleDtodto) {
        List<String> errors = ArticleValidator.validate(articleDtodto);
        if (!errors.isEmpty()){
            log.error("Article is not valid{}",articleDtodto);
            throw  new invalidEntityException("article not valid", ErrorCodes.ARTICLE_NOT_VALIDE, errors);
        }
        return ArticleDto.fromEntity(
                articleRepository.save(ArticleDto.toEntity(articleDtodto)
        ));
    }

    @Override
    public ArticleDto findById(Integer id) {
        if(id ==null){
            log.error("article id is null");
            return null;
        }
        Optional < Article> article = articleRepository.findById(id);

        ArticleDto articleDto=ArticleDto.fromEntity(article.get());
        return Optional.of(articleDto).orElseThrow(()-> new EntityNotFoundException("article avec id" +id+ "not found",ErrorCodes.ARTICLE_NOT_FOUND)
    );
    }

    @Override
    public ArticleDto findByCodeArticle(String codeArticle) {
        if(!StringUtils.hasLength(codeArticle )){
            log.error(" code article id is null");
            return null;
        }
    Optional<Article>article=articleRepository.findArticleByCodeArticle(codeArticle);
        return Optional.of(ArticleDto.fromEntity(article.get())).orElseThrow(()-> new EntityNotFoundException("article avec code article" +codeArticle+ "not found",ErrorCodes.ARTICLE_NOT_FOUND));


    }

    @Override
    public List<ArticleDto> findAll() {
        return articleRepository.findAll().stream()
                .map(ArticleDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if (id==null){
            log.error("id n'existe pas");
            return;
        }
        articleRepository.deleteById(id);

    }
}
