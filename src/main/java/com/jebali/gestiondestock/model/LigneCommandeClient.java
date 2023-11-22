package com.jebali.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "lignecommandeclient")
public class LigneCommandeClient extends  AbstractEntity{

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;


    @ManyToOne
    @JoinColumn(name = "idcommandeclient")
    private CommandeClient commandeclient;
}
