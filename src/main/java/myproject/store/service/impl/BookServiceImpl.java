package myproject.store.service.impl;

import java.util.List;
import java.util.Random;
import myproject.store.dto.BookResponseDto;
import myproject.store.dto.CreateBookRequestDto;
import myproject.store.exception.EntityNotFoundException;
import myproject.store.mapper.BookMapper;
import myproject.store.model.Book;
import myproject.store.repository.BookRepository;
import myproject.store.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository repository;
    private BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookRepository repository, BookMapper bookMapper) {
        this.repository = repository;
        this.bookMapper = bookMapper;
    }

    @Override
    public BookResponseDto save(CreateBookRequestDto requestDto) {
        Book book = bookMapper.toModel(requestDto);
        book.setIsbn("Cool" + new Random(100000).nextInt());
        return bookMapper.toDto(repository.save(book));
    }

    @Override
    public List<BookResponseDto> findAll() {
        return repository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public BookResponseDto findById(Long id) {
        Book book = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Can't find book by id " + id));
        return bookMapper.toDto(book);
    }
}
