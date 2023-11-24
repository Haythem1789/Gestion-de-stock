package com.jebali.gestiondestock.dto;


import com.jebali.gestiondestock.model.LigneCommandeClient;
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

    public LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient){
        if (ligneCommandeClient==null){
            return null;
        }
        return LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                .quantite(ligneCommandeClient.getQuantite())
                .build();
    }

    public LigneCommandeClient toEntity(LigneCommandeClientDto ligneCommandeClientDto){
        if (ligneCommandeClientDto==null){
            return null;
        }
        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setId(ligneCommandeClient.getId());
        ligneCommandeClient.setQuantite(ligneCommandeClient.getQuantite());
        ligneCommandeClient.setPrixUnitaire(ligneCommandeClient.getPrixUnitaire());
        return ligneCommandeClient;
    }
}
