package com.jebali.gestiondestock.dto;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeClientDto {

    private Integer id;

    private BigDecimal quantite;


    private BigDecimal prixUnitaire;


    private ArticleDto article;



    private CommandeClientDto commandeclient;
}
