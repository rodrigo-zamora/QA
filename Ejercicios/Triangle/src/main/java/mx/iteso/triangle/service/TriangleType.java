package mx.iteso.triangle.service;

import mx.iteso.triangle.dto.TriangleDto;
import mx.iteso.triangle.enums.TriangleTypes;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TriangleType {
    public TriangleTypes getTriangleType(TriangleDto triangleDto) {

        if (triangleDto == null || triangleDto.getSideA() == null || triangleDto.getSideB() == null || triangleDto.getSideC() == null) {
            return null;
        }

        if (triangleDto.getSideA() + triangleDto.getSideB() <= triangleDto.getSideC() ||
                triangleDto.getSideA() + triangleDto.getSideC() <= triangleDto.getSideB() ||
                triangleDto.getSideB() + triangleDto.getSideC() <= triangleDto.getSideA()) {
            return null;
        } else if (Objects.equals(triangleDto.getSideA(), triangleDto.getSideB()) &&
                Objects.equals(triangleDto.getSideA(), triangleDto.getSideC())) {
            return TriangleTypes.EQUILATERAL;
        } else if (Objects.equals(triangleDto.getSideA(), triangleDto.getSideB()) ||
                Objects.equals(triangleDto.getSideA(), triangleDto.getSideC()) ||
                Objects.equals(triangleDto.getSideB(), triangleDto.getSideC())) {
            return TriangleTypes.ISOSCELES;
        } else {
            return TriangleTypes.SCALENE;
        }
    }
}
