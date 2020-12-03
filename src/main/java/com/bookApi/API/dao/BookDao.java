package com.bookApi.API.dao;

import com.bookApi.API.model.Book;
import com.bookApi.API.model.Category;
import com.bookApi.API.repository.BookRepository;
import com.bookApi.API.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BookDao {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public Optional<Book> getBookById(Long bookId){
    return bookRepository.findById(bookId);
    }

    public List<Book> getAllBooks(){
        return new ArrayList<>(bookRepository.findAll());
    }

    public void createBook(Book book){
        bookRepository.save(book);
    }

    public void updateBookById(Long bookId, Book book){

    }
}
