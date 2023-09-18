package myproject.store.repository;

import java.util.List;
import myproject.store.model.Book;

public interface BookRepository {
    Book save(Book book);

    List findAll();
}
