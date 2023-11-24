package com.jebali.gestiondestock.dto;

import com.jebali.gestiondestock.model.Adresse;

import com.jebali.gestiondestock.model.Entreprise;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {

    private Integer id;



    private String nom;


    private String description;


    private AdresseDto adresse;


    private String codeFiscal;


    private String photo;


    private String email;


    private String numTel;


    private String siteWeb;




    private List<UtilisateurDto> utilisateurs;

    public EntrepriseDto fromEntity(Entreprise entreprise){
        if (entreprise==null){
            return null;
        }
        return EntrepriseDto.builder()

                .nom(entreprise.getNom())
                .codeFiscal(entreprise.getCodeFiscal())
                .description(entreprise.getDescription())
                .email(entreprise.getEmail())
                .photo(entreprise.getPhoto())
                .numTel(entreprise.getNumTel())
                .siteWeb(entreprise.getSiteWeb())

                .build();
    }

    public Entreprise toEntity(EntrepriseDto entrepriseDto){
        if (entrepriseDto == null){
            return null;
        }
        Entreprise entreprise = new Entreprise();

        entreprise.setNom(entreprise.getNom());
        entreprise.setPhoto(entreprise.getPhoto());
        entreprise.setEmail(entreprise.getEmail());
        entreprise.setCodeFiscal(entreprise.getCodeFiscal());
        entreprise.setEmail(entreprise.getEmail());
        entreprise.setDescription(entreprise.getDescription());
        entreprise.setSiteWeb(entreprise.getSiteWeb());
        entreprise.setNumTel(entreprise.getNumTel());

        return entreprise;
    }
}
