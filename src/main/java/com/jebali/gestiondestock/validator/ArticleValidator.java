package com.jebali.gestiondestock.validator;

import com.jebali.gestiondestock.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {

    public static List<String> validate(ArticleDto articleDto){
        List<String> errors = new ArrayList<>();

        if (articleDto==null ||!StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("veiller rensigner code article svp");
        }
        if (articleDto==null ||!StringUtils.hasLength(articleDto.getDesignation())){
            errors.add("veiller rensigner la designation de l'article svp");
        }
        if (articleDto==null ||articleDto.getPrixUnitaireHt()==null){
            errors.add("veiller rensigner prix unitaire d'article svp");
        }
        if (articleDto==null ||articleDto.getPrixUnitaireTtc() ==null){
            errors.add("veiller rensigner le prix  unitaire d'article svp");
        }

        if (articleDto==null ||articleDto.getTauxTva()==null){
            errors.add("veiller rensigner le taux tva article svp");
        }

        if(articleDto==null || articleDto.getCategory()==null){

            errors.add("veiller selectionnez une categorie");
        }

        return errors;
    }

}
