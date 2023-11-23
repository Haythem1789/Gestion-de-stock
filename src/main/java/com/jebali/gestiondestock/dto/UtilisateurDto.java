package com.jebali.gestiondestock.dto;

import com.jebali.gestiondestock.model.Adresse;

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
}
