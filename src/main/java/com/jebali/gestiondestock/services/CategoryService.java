package com.jebali.gestiondestock.services;

import com.jebali.gestiondestock.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    CategoryDto save(CategoryDto categoryDto);

    CategoryDto findCategoryById(Integer id);

    CategoryDto findCategoryByCodeCategory(String codeCategory);

    List<CategoryDto> findAll();

    void delete(Integer id);
}
