package com.jebali.gestiondestock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "commandeclient")
public class CommandeClient extends AbstractEntity {

    @Column(name="code")
    private String code;

    @Column(name="datecommande")
    private Instant dateCommande;


    @ManyToOne
    @JoinColumn(name = "idclient")
    private Client client;

    @OneToMany(mappedBy ="commandeclient")
    private List<LigneCommandeClient> lignecommandeclient;
}
