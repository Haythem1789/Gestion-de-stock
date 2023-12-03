package com.jebali.gestiondestock.dto;



import com.jebali.gestiondestock.model.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private Integer id;

    private String codeArticle;


    private String designation;


    private BigDecimal prixUnitaireHt;


    private BigDecimal tauxTva;


    private BigDecimal prixUnitaireTtc;


    private String photo;

    private CategoryDto category;

    public static ArticleDto fromEntity(Article article){
        if(article ==null){
            return  null;
        }
        return ArticleDto.builder()

                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .photo(article.getPhoto())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .tauxTva(article.getTauxTva())
                .build();
    }

    public static Article toEntity(ArticleDto articleDto){
        if (articleDto == null){
            return null;
        }
        Article article = new Article();

        article.setCodeArticle(article.getCodeArticle());
        article.setPhoto(article.getPhoto());
        article.setDesignation(article.getDesignation());
        article.setPrixUnitaireHt(article.getPrixUnitaireHt());
        article.setPrixUnitaireTtc(article.getPrixUnitaireTtc());
        article.setTauxTva(article.getTauxTva());
        return article;
    }

}
