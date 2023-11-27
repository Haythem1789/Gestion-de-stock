package com.jebali.gestiondestock.dto;


import com.jebali.gestiondestock.model.Client;
import com.jebali.gestiondestock.model.CommandeClient;
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


    public CommandeClientDto fromEntity(CommandeClient commandeClient){
        if(commandeClient == null){
            return null;
        }
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())

                .build();
    }
    public CommandeClient toEntity(CommandeClientDto commandeClientDto){
        if(commandeClientDto == null){
            return  null;
        }
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClient.getId());
        commandeClient.setCode(commandeClient.getCode());
        commandeClient.setClient(commandeClient.getClient());
        return commandeClient;
    }
}
