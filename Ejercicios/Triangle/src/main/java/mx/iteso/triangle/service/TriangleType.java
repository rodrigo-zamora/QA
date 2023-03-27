package mx.iteso.triangle.service;

import mx.iteso.triangle.dto.TriangleDto;
import mx.iteso.triangle.enums.TriangleTypes;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TriangleType {
    public TriangleTypes getTriangleType(TriangleDto triangleDto) {
        if (Objects.equals(triangleDto.getSideA(), triangleDto.getSideB()) &&
                Objects.equals(triangleDto.getSideA(), triangleDto.getSideC())) {
            return TriangleTypes.EQUILATERAL;
        }

        if (!Objects.equals(triangleDto.getSideA(), triangleDto.getSideB()) &&
                !Objects.equals(triangleDto.getSideA(), triangleDto.getSideC()) &&
                !Objects.equals(triangleDto.getSideB(), triangleDto.getSideC())) {
            return TriangleTypes.SCALENE;
        }

        return TriangleTypes.ISOSCELES;
    }
}
