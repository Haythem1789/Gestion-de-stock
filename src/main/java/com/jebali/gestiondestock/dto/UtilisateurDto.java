package com.jebali.gestiondestock.dto;

import com.jebali.gestiondestock.model.Adresse;

import com.jebali.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String nom;


    private String prenom;


    private String email;


    private Instant dateDeNaissance;


    private String motDePasse;


    private String photo;




    private AdresseDto adresse;


    private EntrepriseDto entreprise;


    private List<RolesDto> roles;


    public UtilisateurDto fromEntity(Utilisateur utilisateur){
        if (utilisateur==null){
            return null;
        }
        return UtilisateurDto.builder()
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .email(utilisateur.getEmail())
                .photo(utilisateur.getPhoto())
                .build();
    }

    public Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if (utilisateurDto==null){
            return null;
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(utilisateur.getNom());
        utilisateur.setPrenom(utilisateur.getPrenom());
        utilisateur.setEmail(utilisateur.getEmail());
        utilisateur.setPhoto(utilisateur.getPhoto());

        return utilisateur;
    }
}
