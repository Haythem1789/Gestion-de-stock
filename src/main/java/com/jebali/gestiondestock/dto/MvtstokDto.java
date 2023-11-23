package com.jebali.gestiondestock.dto;


import com.jebali.gestiondestock.model.TypeMvtStk;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtstokDto {

    private Integer id;

    private BigDecimal quantite;


    private Instant dateMvt;


    private TypeMvtStk typeMvt;


    private ArticleDto article;

}
