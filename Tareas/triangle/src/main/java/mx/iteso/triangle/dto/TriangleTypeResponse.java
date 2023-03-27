package mx.iteso.triangle.dto;

import lombok.Builder;
import lombok.Data;
import mx.iteso.triangle.enums.TriangleTypes;

@Data
@Builder
public class TriangleTypeResponse {

    TriangleTypes type;

}
