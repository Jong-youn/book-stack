package backend.bookstack.dto;

import backend.bookstack.model.ReviewEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReviewDTO {
    private Integer id;
    private String bookId;
    private String contents;

    public ReviewDTO(final ReviewEntity entity) {
        this.id = entity.getId();
        this.bookId = entity.getBookId();
        this.contents = entity.getContents();
    }

    public static ReviewEntity toEntity(ReviewDTO reviewDTO) {
        return ReviewEntity.builder()
                .id(reviewDTO.getId())
                .bookId(reviewDTO.getBookId())
                .contents(reviewDTO.getContents())
                .build();
    }
}
