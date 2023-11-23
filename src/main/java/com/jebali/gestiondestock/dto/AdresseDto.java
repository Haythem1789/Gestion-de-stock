package com.jebali.gestiondestock.dto;

import com.jebali.gestiondestock.model.Adresse;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdresseDto {



    private String adresse1;


    private String adresse2;



    private String ville;


    private String codePostale;


    private String pays;

    public AdresseDto fromEntity(Adresse adresse){
        if(adresse == null){
            return null;
        }
        return AdresseDto.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .codePostale(adresse.getCodePostale())
                .ville(adresse.getVille())
                .pays(adresse.getPays())
                .build();


    }
    public Adresse toEntity(AdresseDto adresseDto){
        if(adresseDto == null){
            return null;
        }
        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresse.getAdresse1());
        adresse.setAdresse2(adresse.getAdresse2());
        adresse.setCodePostale(adresse.getCodePostale());
        adresse.setPays(adresse.getPays());
        adresse.setVille(adresse.getVille());
     return  adresse;
    }
}
