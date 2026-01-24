package com.example.jpa_library.service;

import com.example.jpa_library.dao.AuthorRepository;
import com.example.jpa_library.dao.BookRepository;
import com.example.jpa_library.entity.Author;
import com.example.jpa_library.entity.Book;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private BookRepository bookRepository;
    private AuthorRepository authorRepo;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
        this.bookRepository = bookRepository;

    }

    public Book createBook(Book book){
        book.setCreateDate(new Date());
        book.setPublishDate(new Date());
//        Author author = book.getAuthor();
//        author = authorRepo.save(author);
//        book.setAuthor(author);

        return bookRepository.save(book);
    }

    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> findBookById(Long id){
        return bookRepository.findById(id);
    }

    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }

    public Optional<Book> findBookByIsbn(String isbn){
        return bookRepository.findByIsbn(isbn);
    }

    public List<Book> createAllBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }

    public List<Book> getBooks(String description){
        return bookRepository.findAllByDescriptionContainingIgnoreCase(description);
    }
}
