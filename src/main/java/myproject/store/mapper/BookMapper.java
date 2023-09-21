package myproject.store.mapper;

import myproject.store.config.MapperConfig;
import myproject.store.dto.BookResponseDto;
import myproject.store.dto.CreateBookRequestDto;
import myproject.store.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {

    BookResponseDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);
}
