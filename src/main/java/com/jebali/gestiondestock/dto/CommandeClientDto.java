package com.jebali.gestiondestock.dto;


import com.jebali.gestiondestock.model.Client;
import com.jebali.gestiondestock.model.LigneCommandeClient;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String code;


    private Instant dateCommande;

    private ClientDto client;



    private List<LigneCommandeClientDto> lignecommandeclient;
}
