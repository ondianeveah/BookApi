package com.bookApi.API.controller;

import com.bookApi.API.dto.SuccessfulResponseDetail;
import com.bookApi.API.model.Book;
import com.bookApi.API.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books/{bookId}", method = RequestMethod.GET)
    public ResponseEntity getBookById(@PathVariable Long bookId){
        Optional<Book> book = bookService.getBooksById(bookId);
        SuccessfulResponseDetail successfulResponseDetail = new SuccessfulResponseDetail(HttpStatus.OK.value(), "Successfully received book by id", book);
        return new ResponseEntity(successfulResponseDetail, HttpStatus.OK);
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public ResponseEntity getAllBooks(){
        List<Book> bookList = bookService.getAllBooks();
        SuccessfulResponseDetail successfulResponseDetail = new SuccessfulResponseDetail(HttpStatus.OK.value(), "Successfully received all books", bookList);
        return new ResponseEntity(successfulResponseDetail, HttpStatus.OK);
    }

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public ResponseEntity createBook(@RequestBody Book book){
        bookService.createBook(book);
        SuccessfulResponseDetail successfulResponseDetail = new SuccessfulResponseDetail(HttpStatus.CREATED.value(), "Successfully posted book", book);
        return new ResponseEntity(successfulResponseDetail, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/books/{bookId}", method = RequestMethod.PUT)
    public ResponseEntity updateBookById(@PathVariable Long bookId, @RequestBody Book book){
        bookService.updateBookById(bookId, book);
        SuccessfulResponseDetail successfulResponseDetail = new SuccessfulResponseDetail(HttpStatus.ACCEPTED.value(), "Successfully updated book", book);
        return new ResponseEntity(successfulResponseDetail, HttpStatus.ACCEPTED);
    }
}
