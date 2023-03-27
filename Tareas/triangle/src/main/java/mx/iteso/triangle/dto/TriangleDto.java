package mx.iteso.triangle.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class TriangleDto {

    @Positive(message = "sideA must be higher than 0")
    Long sideA;

    @Positive(message = "sideB must be higher than 0")
    Long sideB;

    @Positive(message = "sideC must be higher than 0")
    Long sideC;

    public TriangleDto(Long sideA, Long sideB, Long sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (!isValidTriangle()) {
            throw new IllegalArgumentException("The side lengths do not correspond to a real triangle");
        }
    }

    public boolean isValidTriangle() {
        // check if the side lengths correspond to a real triangle
        return sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA;

    }

}
