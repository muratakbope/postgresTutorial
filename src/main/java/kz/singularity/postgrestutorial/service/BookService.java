package kz.singularity.postgrestutorial.service;

import kz.singularity.postgrestutorial.entity.Book;
import kz.singularity.postgrestutorial.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book getBookById(Long id) {
        Book book = bookRepository.findBookById(id);
        return book;
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteBookById(id);

    }

    public Book getBookByAuthor(String author) {
        Book book = bookRepository.getBookByAuthor(author);
        return book;
    }

    public List<Book> getBookByAuthorAndYear(String author, int year){
        List<Book> bookList = bookRepository.getBookByAuthorAndYearPub(author, year);
        return bookList;
    }




}
