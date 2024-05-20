package kz.singularity.postgrestutorial.repository;

import kz.singularity.postgrestutorial.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Book findBookById(Long id);
    void deleteBookById(Long id);
    Book getBookByAuthor(String author);

    List<Book> getBookByAuthorAndYearPub(String author, int year);

}
