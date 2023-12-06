package com.jebali.gestiondestock.controller.api;

import com.jebali.gestiondestock.dto.CategoryDto;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.jebali.gestiondestock.utils.constants.APP_ROUTE;
public interface CategoryApi {

    @PostMapping(value = APP_ROUTE + "/category/creation",consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    CategoryDto save(@RequestBody CategoryDto categoryDto);

    @GetMapping(value = APP_ROUTE+"category/{idcategory}",produces = MediaType.APPLICATION_JSON_VALUE)
    CategoryDto findCategoryById(@PathVariable("idcategory") Integer id);


    @GetMapping(value = APP_ROUTE+"category/{codeCategory}",produces = MediaType.APPLICATION_JSON_VALUE)
    CategoryDto findCategoryByCodeCategory(@PathVariable String codeCategory);

    @GetMapping(value = APP_ROUTE+"category/{codeCategory}",produces = MediaType.APPLICATION_JSON_VALUE)
    List<CategoryDto> findAll();

    @DeleteMapping(value = APP_ROUTE+"/category/delete/{idcategory}")
    void delete(@PathVariable("idcategory") Integer id);
}
