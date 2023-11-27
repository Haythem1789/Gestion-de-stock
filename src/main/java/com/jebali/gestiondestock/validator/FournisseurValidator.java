package com.jebali.gestiondestock.validator;

import com.jebali.gestiondestock.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {

    public static List<String> validate(FournisseurDto fournisseurDto){
        List<String> errers = new ArrayList<>();

        if (fournisseurDto==null || !StringUtils.hasLength(fournisseurDto.getPrenom())){
            errers.add("verifier le prenom");
        }
        if (fournisseurDto==null || !StringUtils.hasLength(fournisseurDto.getNom())){
            errers.add("verifier le nom");
        }
        if (fournisseurDto==null || !StringUtils.hasLength(fournisseurDto.getMail())){
            errers.add("verifier le mail");
        }
        if (fournisseurDto==null || !StringUtils.hasLength(fournisseurDto.getNumtel())){
            errers.add("verifier le numero de telephone");
        }
        return errers;
    }
}
