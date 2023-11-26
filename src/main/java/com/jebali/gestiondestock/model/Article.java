package com.jebali.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "article")
public class Article extends AbstractEntity{

    @Column(name = "identreprise")
    private  Integer idEntreprise;

    @Column(name="codearticle")
    private String codeArticle;

    @Column(name="designation")
    private String designation;

    @Column(name="prixunitaireht")
    private BigDecimal prixUnitaireHt;

    @Column(name="tauxtva")
    private BigDecimal tauxTva;

    @Column(name="prixunitairettc")
    private BigDecimal prixUnitaireTtc;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;

}
