package com.jebali.gestiondestock.dto;

import com.jebali.gestiondestock.model.Adresse;

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
}
