package com.jebali.gestiondestock.dto;


import com.jebali.gestiondestock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class VentesDto {

    private Integer id;

    private String code;


    private Instant dateVente;


    private String commentaire;


    public VentesDto fromEntity(Ventes ventes){
        if (ventes==null){
            return null;
        }
        return VentesDto.builder()
                .code(ventes.getCode())
                .dateVente(ventes.getDateVente())
                .commentaire(ventes.getCommentaire())
                .build();
    }
    public Ventes toEntity(VentesDto ventesDto){
        if (ventesDto==null){
            return null;
        }
        Ventes ventes = new Ventes();
        ventes.setCode(ventes.getCode());
        ventes.setDateVente(ventes.getDateVente());
        ventes.setCommentaire(ventes.getCommentaire());
        return ventes;
    }
}


