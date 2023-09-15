package myproject.store.service;

import myproject.store.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);
    List findAll();
}
