package myproject.store.service;

import java.util.List;
import myproject.store.dto.BookResponseDto;
import myproject.store.dto.CreateBookRequestDto;

public interface BookService {

    BookResponseDto save(CreateBookRequestDto requestDto);

    List<BookResponseDto> findAll();

    BookResponseDto findById(Long id);
}
