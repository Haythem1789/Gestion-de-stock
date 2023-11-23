package com.jebali.gestiondestock.dto;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Integer id;

    private BigDecimal quantite;


    private BigDecimal prixUnitaire;


    private CommandeFournisseurDto commandefournisseur;



    private ArticleDto article;

}
