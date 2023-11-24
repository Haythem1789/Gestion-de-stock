package com.jebali.gestiondestock.dto;


import com.jebali.gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;

import javax.management.relation.Role;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private String roleName;


    private UtilisateurDto utilisateur;

    public RolesDto fromEntity(Roles roles){
        if (roles==null){
            return null;
        }
        return RolesDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .build();

    }

    public Roles toEntity(RolesDto rolesDto){
        if (rolesDto==null){
            return null;
        }
        Roles roles = new Roles();
        roles.setId(roles.getId());
        roles.setRoleName(roles.getRoleName());
        return roles;
    }
}
