package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface BookService {
    Iterable<Book> getAll();
    Optional getBookById(Long id);
    Book saveBook(Book book);
    void delete(Long id);
}
