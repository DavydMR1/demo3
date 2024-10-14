package com.example.demo3.services;

import com.example.demo3.models.Book;
import com.example.demo3.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setTitle;
            book.setAuthor;
            book.setPublicationYear;
            return bookRepository.save(book);
        }
        else {
            throw new IllegalArgumentException("Book not found");
        }
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
