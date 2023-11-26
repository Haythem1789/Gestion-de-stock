package com.jebali.gestiondestock.exception;

public enum ErrorCodes {

    ARTICLE_NOT_FOUND(1000),
    ARTICLE_NOT_VALIDE(1001),
    CATEGORY_NOT_FOUND(2000),
    CLIENT_NOT_FOUND(3000),
    COMMANDE_CLIENT_NOT_FOUND(4000),
    COMMANDE_FOURNISSEUR_NOT_FOUND(5000),
    FOURNISSEUR_NOT_FOUND(6000),
    LIGNE_COMMANDE_CLIENT_NOT_FOUND(7000),
    LIGNE_COMMANDE_FOURNISSEUR_NOT_FOUND(8000),
    MVTSTOK_NOT_FOUND(9000),
    VENTE_NOT_FOUND(10000),
    UTILISATEUR_NOT_FOUND(11000),
    ENTREPRISE_NOT_FOUND(12000);


    private Integer code;



    ErrorCodes(int code){
        this.code=code;

    }

    public Integer getCode() {
        return code;
    }
}
