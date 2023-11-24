package com.jebali.gestiondestock.dto;

import com.jebali.gestiondestock.model.Adresse;

import com.jebali.gestiondestock.model.Fournisseur;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FournisseurDto {

    private Integer id;

    private String nom;


    private String prenom;



    private AdresseDto adresse;


    private String photo;


    private String mail;


    private String numtel;




    private List<CommandeFournisseurDto> commandefournisseur;

    public FournisseurDto fromEntity(Fournisseur fournisseur){
        if (fournisseur==null){
            return null;
        }
        return FournisseurDto.builder()

                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .photo(fournisseur.getPhoto())
                .mail(fournisseur.getMail())
                .numtel(fournisseur.getNumtel())
                .build();
    }

    public  Fournisseur toEntity(EntrepriseDto entrepriseDto){
        if (entrepriseDto==null){
            return  null;
        }
        Fournisseur fournisseur = new Fournisseur();

        fournisseur.setNom(fournisseur.getNom());
        fournisseur.setMail(fournisseur.getMail());
        fournisseur.setPrenom(fournisseur.getPrenom());
        fournisseur.setNumtel(fournisseur.getNumtel());
        fournisseur.setPhoto(fournisseur.getPhoto());
        return  fournisseur;
    }
}
