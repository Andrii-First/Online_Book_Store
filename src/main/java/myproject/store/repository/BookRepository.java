package myproject.store.repository;

import myproject.store.model.Book;

import java.util.List;

public interface BookRepository {
    Book save(Book book);
    List findAll();
}
