package com.jebali.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "fournisseur")
public class Fournisseur extends  AbstractEntity{

    @Column(name = "identreprise")
    private  Integer idEntreprise;

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;


    @Embedded
    private Adresse adresse;

    @Column(name="photo")
    private String photo;

    @Column(name="mail")
    private String mail;

    @Column(name="numtel")
    private String numtel;



    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandefournisseur;

}
