package backend.bookstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BookstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstackApplication.class, args);
	}

}
