package com.jebali.gestiondestock.services.impl;

import com.jebali.gestiondestock.dto.CategoryDto;
import com.jebali.gestiondestock.exception.EntityNotFoundException;
import com.jebali.gestiondestock.exception.ErrorCodes;
import com.jebali.gestiondestock.exception.invalidEntityException;
import com.jebali.gestiondestock.model.Category;
import com.jebali.gestiondestock.repository.CategoryRepository;
import com.jebali.gestiondestock.services.CategoryService;
import com.jebali.gestiondestock.validator.CategoryValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        List<String> error = CategoryValidator.validate(categoryDto);
        if(!error.isEmpty()){
            log.error("category is not valid{}",categoryDto);
            throw new invalidEntityException("category not valid", ErrorCodes.CATEGORY_NOT_FOUND,error);
        }
        return categoryDto.fromEntity(categoryRepository.save(CategoryDto.toEntity(categoryDto)));
    }

    @Override
    public CategoryDto findCategoryById(Integer id) {
        if(id==null){
            log.error("l'id de category n'xiste pas",id);
            return null;
        };
        Optional<Category> category=categoryRepository.findById(id);
        CategoryDto categoryDto=CategoryDto.fromEntity(category.get());
        return Optional.of(categoryDto).orElseThrow(()-> new EntityNotFoundException("category with id "+id+" not found",ErrorCodes.CATEGORY_NOT_FOUND));
    }

    @Override
    public CategoryDto findCategoryByCodeCategory(String codeCategory) {
        if(!StringUtils.hasLength(codeCategory)){
            log.error("code article not valid");

        return null;
        }
        Optional<Category>category=categoryRepository.findCategoryByCodeCategory(codeCategory);
        return Optional.of(CategoryDto.fromEntity(category.get())).orElseThrow(()->new EntityNotFoundException("code category "+codeCategory+"not existe",ErrorCodes.CATEGORY_NOT_FOUND));
    }


    @Override
    public List<CategoryDto> findAll() {
        return categoryRepository.findAll().stream()
                .map(CategoryDto::fromEntity)
                .collect(Collectors.toList());


    }

    @Override
    public void delete(Integer id) {
        if(id==null){
            log.error("id not found");
            return;
        }
        categoryRepository.deleteById(id);

    }
}
