package backend.bookstack.model;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "book")
public class BookEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    private String title;
    private String author;
    private String publisher;
    private String image;
    private Integer page;

    @Column(name = "publication_date")
    @Temporal(TemporalType.DATE)
    private Date publicationDate;

    @Lob
    @Column(name="table_of_contents")
    private String tableOfContents;

    @Lob
    private String summary;
}
