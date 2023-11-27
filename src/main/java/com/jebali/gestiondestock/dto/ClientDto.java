package com.jebali.gestiondestock.dto;

import com.jebali.gestiondestock.model.Adresse;

import com.jebali.gestiondestock.model.Client;
import com.jebali.gestiondestock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;


    private String prenom;



    private AdresseDto adresse;


    private String photo;


    private String mail;


    private String numtel;

    private List<CommandeClientDto> commandeclient;

    public ClientDto fromEntity(Client client){
        if(client == null){
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .photo(client.getPhoto())
                .numtel(client.getNumtel())
                .build();


    }

    public Client toEntity(ClientDto clientDto){
        if(clientDto == null){
            return null;
        }
        Client client = new Client();
        client.setId(client.getId());
        client.setNom(client.getNom());
        client.setPrenom(client.getPrenom());
        client.setPhoto(client.getPhoto());
        client.setNumtel(client.getNumtel());
        return  client;
    }
}
