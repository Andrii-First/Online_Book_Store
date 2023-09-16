package myproject.store.service.impl;

import myproject.store.model.Book;
import myproject.store.repository.BookRepository;
import myproject.store.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }
}
