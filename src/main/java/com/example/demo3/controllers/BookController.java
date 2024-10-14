package com.example.demo3.controllers;

import com.example.demo3.models.Book;
import com.example.demo3.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping()
    public List<Book> getBooks() {
        return bookService.getBooks();
    }
}
