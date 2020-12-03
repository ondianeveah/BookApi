package com.bookApi.API.dao;

import com.bookApi.API.model.Category;
import com.bookApi.API.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CategoryDao {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return new ArrayList<>(categoryRepository.findAll());
    }

//    public void createCategory(Category category){
//        categoryRepository.save(category);
//    }
}
