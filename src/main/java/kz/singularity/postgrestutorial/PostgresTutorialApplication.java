package kz.singularity.postgrestutorial;

import kz.singularity.postgrestutorial.entity.Book;
import kz.singularity.postgrestutorial.repository.BookRepository;
import kz.singularity.postgrestutorial.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PostgresTutorialApplication implements CommandLineRunner {

    @Autowired
    BookService bookService;

    @Autowired
    BookRepository bookRepository;
    public static void main(String[] args) {
        SpringApplication.run(PostgresTutorialApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<Book> books = bookService.getBookByAuthorAndYear("Gyugo", 2000);
        System.out.println(books.toString());
        while (true) {

        }
    }
}
