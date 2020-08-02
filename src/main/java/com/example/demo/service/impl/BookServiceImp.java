package com.example.demo.service.impl;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BookServiceImp implements BookService {
    @Autowired
    private BookRepo bookRepo;

    @Override
    public Iterable<Book> getAll() {
        return bookRepo.findAll();
    }

    @Override
    public Optional getBookById(Long id) {
        return bookRepo.findById(id);
    }

    @Override
    public Book saveBook(Book book) {
        return (Book) bookRepo.save(book);
    }

    @Override
    public void delete(Long id) {
        bookRepo.deleteById(id);
    }
}
