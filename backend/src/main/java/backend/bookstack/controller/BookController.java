package backend.bookstack.controller;

import backend.bookstack.dto.ResponseDTO;
import backend.bookstack.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/search")
    public String search(@RequestParam(required = false) String keyword) {
        String response = service.search(keyword);
//        try {
//            if (keyword != null) {
//
//                return ResponseEntity.ok().body();
//
//        } catch (Exception e) {
//            ResponseDTO response = ResponseDTO.builder().error(e.getMessage()).build();
//
//            return ResponseEntity.badRequest().body(response);
//        }

        return response;
    }
}
