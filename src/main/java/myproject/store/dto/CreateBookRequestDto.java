package myproject.store.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class CreateBookRequestDto {

    private String title;
    private String author;
    private BigDecimal price;
    private String description;
}
