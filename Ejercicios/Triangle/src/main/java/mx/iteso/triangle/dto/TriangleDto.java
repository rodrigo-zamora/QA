package mx.iteso.triangle.dto;

import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TriangleDto {


    @NotNull
    @Positive
    Long sideA;

    @NotNull
    @Positive
    Long sideB;

    @NotNull
    @Positive
    Long sideC;

    public boolean isValidTriangle() {
        // check if the side lengths correspond to a real triangle
        return sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA;

    }

}
