package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/books")
public class APIController {
    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    public Iterable<Book> getAll(){
        return bookService.getAll();
    }
    @GetMapping("/detail/{id}")
    public Optional getAll(@PathVariable Long id){
        return bookService.getBookById(id);
    }
    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteBook(@RequestBody Book book){
        bookService.delete(book.getId());
    }
}
