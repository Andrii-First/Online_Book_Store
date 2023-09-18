package myproject.store.service;

import java.util.List;
import myproject.store.model.Book;

public interface BookService {
    Book save(Book book);

    List findAll();
}
