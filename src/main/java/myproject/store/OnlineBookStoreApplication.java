package myproject.store;

import java.math.BigDecimal;
import myproject.store.model.Book;
import myproject.store.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineBookStoreApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(OnlineBookStoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book = new Book();
            book.setAuthor("Unknown");
            book.setDescription("So-so");
            book.setTitle("Template");
            book.setPrice(BigDecimal.valueOf(100));
            book.setIsbn("abc");
            bookService.save(book);
            System.out.println(bookService.findAll());
        };
    }

}
