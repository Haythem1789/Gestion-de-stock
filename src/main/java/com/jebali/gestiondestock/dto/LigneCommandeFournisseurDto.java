package com.jebali.gestiondestock.dto;


import com.jebali.gestiondestock.model.LigneCommandeClient;
import com.jebali.gestiondestock.model.LigneCommandeFournisseur;
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

    public LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {
        if (ligneCommandeFournisseur == null) {
            return null;
        }
        return LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
                .quantite(ligneCommandeFournisseur.getQuantite())
                .build();
    }

    public LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto) {
        if (ligneCommandeFournisseurDto == null) {
            return null;
        }
        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
        ligneCommandeFournisseur.setId(ligneCommandeFournisseur.getId());
        ligneCommandeFournisseur.setQuantite(ligneCommandeFournisseur.getQuantite());
        ligneCommandeFournisseur.setPrixUnitaire(ligneCommandeFournisseur.getPrixUnitaire());
        return ligneCommandeFournisseur;

    }
}
