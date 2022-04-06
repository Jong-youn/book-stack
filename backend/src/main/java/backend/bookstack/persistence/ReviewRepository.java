package backend.bookstack.persistence;

import backend.bookstack.model.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity, String> {

    List<ReviewEntity> findById(Integer id);
    List<ReviewEntity> findByUserIdAndBookId(String userId, String bookId);
}
