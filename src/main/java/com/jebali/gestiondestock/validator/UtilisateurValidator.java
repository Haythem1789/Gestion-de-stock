package com.jebali.gestiondestock.validator;

import com.jebali.gestiondestock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDto utilisateurDto){

        List<String> errors= new ArrayList<>();
        if (utilisateurDto==null || !StringUtils.hasLength(utilisateurDto.getEmail())){
            errors.add("veillez renseigner l'email d'utilisateur");
        }

        if (utilisateurDto==null || !StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("veillez renseigner le nom d'utilisateur");
        }

        if (utilisateurDto==null || !StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("veillez renseigner le prenom d'utilisateur");
        }

        if (utilisateurDto==null || !StringUtils.hasLength(utilisateurDto.getMotDePasse())){
            errors.add("veillez renseigner le mot de passe d'utilisateur");
        }


        if (utilisateurDto==null ||utilisateurDto.getAdresse()==null){
            errors.add("veillez renseigner l'adresse d'utilisateur");
        }
        else {
            if (utilisateurDto==null || !StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1())) {
                errors.add("veillez renseigner l'adresse principale d'utilisateur");
            }
            if (utilisateurDto==null || !StringUtils.hasLength(utilisateurDto.getAdresse().getVille())) {
                errors.add("veillez renseigner la ville  d'utilisateur");
            }

            if (utilisateurDto==null || !StringUtils.hasLength(utilisateurDto.getAdresse().getPays())) {
                errors.add("veillez renseigner la pays  d'utilisateur");
            }
            if (utilisateurDto==null || !StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostale())){
                errors.add("veillez renseigner le code postale  d'utilisateur");


    }
}
        if (utilisateurDto.getDateDeNaissance()==null){
            errors.add("veillez renseigner la date de naissance d'utilisateur");
        }
        return  errors;
    }
}