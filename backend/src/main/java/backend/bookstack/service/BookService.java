package backend.bookstack.service;

import backend.bookstack.dto.BookDTO;
import backend.bookstack.model.BookEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@Service
public class BookService {

    public String search(final String keyword) {
        if (keyword == null) {
            log.warn("Keyword cannot be null");
            throw new RuntimeException("Keyword cannot be null.");
        }

        final String url = "https://openapi.naver.com/v1/search/book.json?query=";

        // 결과 = 전송
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url + keyword, String.class);

        System.out.println("result = " + result);
        return result;
    }
}
