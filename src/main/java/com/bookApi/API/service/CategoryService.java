package com.bookApi.API.service;

import com.bookApi.API.dao.CategoryDao;
import com.bookApi.API.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> getAllCategories(){
        return categoryDao.getAllCategories();
    }

//    public void createCategory(Category category){
//        categoryDao.createCategory(category);
//    }
}
