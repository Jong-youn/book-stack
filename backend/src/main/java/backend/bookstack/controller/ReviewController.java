package backend.bookstack.controller;

import backend.bookstack.dto.ResponseDTO;
import backend.bookstack.dto.ReviewDTO;
import backend.bookstack.model.ReviewEntity;
import backend.bookstack.service.ReviewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ReviewDTO reviewDTO) {

        try {
            String userId = "user1";
            ReviewEntity entity = ReviewDTO.toEntity(reviewDTO);
            entity.setId(null);
            entity.setUserId(userId);

            List<ReviewEntity> review = service.create(entity);
            List<ReviewDTO> dto = review.stream().map(ReviewDTO::new).collect(Collectors.toList());
            ResponseDTO response = ResponseDTO.builder().data(dto).build();

            return ResponseEntity.ok().body(response);

        } catch (Exception e) {
            ResponseDTO response = ResponseDTO.builder().error(e.getMessage()).build();

            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping
    public ResponseEntity<?> readOneReview(@RequestBody ReviewDTO reviewDTO) {

        try {
            ReviewEntity entity = ReviewDTO.toEntity(reviewDTO);
            entity.setUserId("user1");

            List<ReviewEntity> searchedReview = service.readOne(entity);
            List<ReviewDTO> dto = searchedReview.stream().map(ReviewDTO::new).collect(Collectors.toList());
            ResponseDTO response = ResponseDTO.builder().data(dto).build();

            return ResponseEntity.ok().body(response);

        } catch (Exception e) {
            ResponseDTO response = ResponseDTO.builder().error(e.getMessage()).build();

            return ResponseEntity.badRequest().body(response);
        }
    }
}
