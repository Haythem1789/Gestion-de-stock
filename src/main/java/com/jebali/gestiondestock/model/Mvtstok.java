package com.jebali.gestiondestock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "mvtstock")
public class Mvtstok extends  AbstractEntity{

    @Column(name = "identreprise")
    private  Integer idEntreprise;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name = "typemvt")
    private TypeMvtStk typeMvt;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;




}
