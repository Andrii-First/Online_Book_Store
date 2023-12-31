package myproject.store.repository;

import java.util.List;
import java.util.Optional;
import myproject.store.model.Book;

public interface BookRepository {

    Book save(Book book);

    List<Book> findAll();

    Optional<Book> findById(Long id);
}
