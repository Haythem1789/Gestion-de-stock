package com.jebali.gestiondestock.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jebali.gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class CategoryDto {

    private Integer id;


    private String code;


    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles;

    public static CategoryDto fromEntity(Category category) {
        if (category == null) {
            return null;
        }
        //mapping categorydto ->category
        return CategoryDto.builder()

                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }

    public static Category toEntity(CategoryDto categoryDto) {
        if (categoryDto == null) {
            return null;
        }
        Category category = new Category();

        category.setCode(category.getCode());
        category.setDesignation(category.getDesignation());
        return  category;
    }


}
