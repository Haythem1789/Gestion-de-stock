package com.jebali.gestiondestock.dto;


import com.jebali.gestiondestock.model.Mvtstok;
import com.jebali.gestiondestock.model.TypeMvtStk;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtstokDto {

    private Integer id;

    private BigDecimal quantite;


    private Instant dateMvt;


    private TypeMvtStk typeMvt;


    private ArticleDto article;

    public MvtstokDto fromEntity(Mvtstok mvtstok){
        if (mvtstok==null){
            return null;
        }
        return MvtstokDto.builder()
                .id(mvtstok.getId())
                .quantite(mvtstok.getQuantite())
                .dateMvt(mvtstok.getDateMvt())
                .typeMvt(mvtstok.getTypeMvt())
                .build();
    }

    public Mvtstok toEntity(MvtstokDto mvtstokDto){
        if (mvtstokDto==null){
            return null;
        }
        Mvtstok mvtstok = new Mvtstok();
        mvtstok.setId(mvtstok.getId());
        mvtstok.setQuantite(mvtstok.getQuantite());
        mvtstok.setDateMvt(mvtstok.getDateMvt());
        mvtstok.setTypeMvt(mvtstok.getTypeMvt());
        return mvtstok;
    }

}
