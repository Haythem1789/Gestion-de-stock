package com.jebali.gestiondestock.controller;

import com.jebali.gestiondestock.controller.api.CategoryApi;
import com.jebali.gestiondestock.dto.CategoryDto;
import com.jebali.gestiondestock.services.CategoryService;

import java.util.List;

public class CategoryController implements CategoryApi {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        return categoryService.save(categoryDto);
    }

    @Override
    public CategoryDto findCategoryById(Integer id) {
        return categoryService.findCategoryById(id);
    }

    @Override
    public CategoryDto findCategoryByCodeCategory(String codeCategory) {
        return categoryService.findCategoryByCodeCategory(codeCategory);
    }

    @Override
    public List<CategoryDto> findAll() {
        return categoryService.findAll();
    }

    @Override
    public void delete(Integer id) {
        categoryService.delete(id);

    }
}
