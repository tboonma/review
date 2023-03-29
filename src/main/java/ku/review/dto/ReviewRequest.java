package ku.review.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
public class ReviewRequest {
    private UUID restaurantId;

    @NotBlank
    private String username;

    @NotBlank
    private String reviewText;
}
