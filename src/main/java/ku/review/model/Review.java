package ku.review.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.util.UUID;

@Data
@Entity
public class Review {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(columnDefinition = "varbinary(16)")
    private UUID restaurantId;
    private String username;
    private String reviewText;
    private Instant createdAt;
}
