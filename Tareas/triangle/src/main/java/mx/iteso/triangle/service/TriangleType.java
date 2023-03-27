package mx.iteso.triangle.service;

import mx.iteso.triangle.dto.TriangleDto;
import mx.iteso.triangle.enums.TriangleTypes;
import org.springframework.stereotype.Service;

@Service
public class TriangleType {
    public TriangleTypes getTriangleType(TriangleDto triangleDto) {
        if (triangleDto.getSideA() == triangleDto.getSideB() &&
                triangleDto.getSideA() == triangleDto.getSideC()) {
            return TriangleTypes.EQUILATERAL;
        }

        if (triangleDto.getSideA() != triangleDto.getSideB() &&
            triangleDto.getSideA() != triangleDto.getSideC() &&
            triangleDto.getSideB() != triangleDto.getSideC()) {
            return TriangleTypes.SCALENE;
        }

        return TriangleTypes.ISOSCELES;
    }
}
