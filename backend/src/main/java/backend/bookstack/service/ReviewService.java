package backend.bookstack.service;

import backend.bookstack.model.ReviewEntity;
import backend.bookstack.persistence.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReviewService {

    @Autowired
    private ReviewRepository repository;

    public List<ReviewEntity> create(final ReviewEntity entity) {

        repository.save(entity);
        log.info("Review Id: {} is saved", entity.getId());

        return repository.findById(entity.getId());
    }

    public List<ReviewEntity> readOne(final ReviewEntity entity) {

        final String userId = entity.getUserId();
        final String bookId = entity.getBookId();

        return repository.findByUserIdAndBookId(userId, bookId);
    }

    public List<ReviewEntity> readAll(final String userId) {

        return repository.findByUserIdOrderByCreatedAtDesc(userId);
    }
}
