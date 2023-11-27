package com.jebali.gestiondestock.validator;

import com.jebali.gestiondestock.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public static List<String> validate(ClientDto clientDto){
        List<String> errors = new ArrayList<>();

        if (clientDto==null || !StringUtils .hasLength(clientDto.getNom())){
            errors.add("veillez rensigner le nom du client");
        }

        if (clientDto==null || !StringUtils .hasLength(clientDto.getPrenom())){
            errors.add("veillez rensigner le prenom du client");
        }
        if (clientDto==null || !StringUtils .hasLength(clientDto.getNumtel())){
            errors.add("veillez rensigner le numero de telephone du client");
        }
        if (clientDto==null || !StringUtils .hasLength(clientDto.getMail())){
            errors.add("veillez rensigner le mail du client");
        }



        return errors;
    }
}

