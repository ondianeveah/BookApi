package com.bookApi.API.controller;

import com.bookApi.API.dto.SuccessfulResponseDetail;
import com.bookApi.API.model.Book;
import com.bookApi.API.model.Category;
import com.bookApi.API.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public ResponseEntity getAllCategories(){
        List<Category> categoryList = categoryService.getAllCategories();
        SuccessfulResponseDetail successfulResponseDetail = new SuccessfulResponseDetail(HttpStatus.OK.value(), "Successfully received all categories", categoryList);
        return new ResponseEntity(successfulResponseDetail, HttpStatus.OK);
    }

//    @RequestMapping(value = "categories", method = RequestMethod.POST)
//    public ResponseEntity createCategory(@RequestBody Category category){
//        categoryService.createCategory(category);
//        SuccessfulResponseDetail successfulResponseDetail = new SuccessfulResponseDetail(HttpStatus.CREATED.value(), "Successfully posted all categories", category);
//        return new ResponseEntity(successfulResponseDetail, HttpStatus.CREATED);
//    }
}
