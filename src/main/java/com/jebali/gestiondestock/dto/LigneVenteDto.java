package com.jebali.gestiondestock.dto;


import com.jebali.gestiondestock.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {

    private Integer id;

    private BigDecimal quantite;


    private BigDecimal prixUnitaire;


    private VentesDto vente;

    public LigneVenteDto fromEntity(LigneVente ligneVente){
        if (ligneVente==null){
            return null;
        }
        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .quantite(ligneVente.getQuantite())
                .build();
    }

    public LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if (ligneVenteDto==null){
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVente.getId());
        ligneVente.setQuantite(ligneVente.getQuantite());
        ligneVente.setPrixUnitaire(ligneVente.getPrixUnitaire());
        return ligneVente;
    }
}
