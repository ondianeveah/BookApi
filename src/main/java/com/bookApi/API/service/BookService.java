package com.bookApi.API.service;

import com.bookApi.API.dao.BookDao;
import com.bookApi.API.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public Optional<Book> getBooksById(Long bookId){
        return bookDao.getBookById(bookId);
    }

    public List<Book> getAllBooks(){
        return bookDao.getAllBooks();
    }

    public void createBook(Book book){
        bookDao.createBook(book);
    }

    public void updateBookById(Long bookId, Book book){
        bookDao.updateBookById(bookId, book);
    }
}
