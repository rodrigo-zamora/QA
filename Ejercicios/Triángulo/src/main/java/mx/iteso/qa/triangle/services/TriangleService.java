package mx.iteso.qa.triangle.services;

import mx.iteso.qa.triangle.enums.TriangleType;

@org.springframework.stereotype.Service
public class TriangleService {
    public double getArea(int sideA, int sideB, int sideC) {
        int s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public String getType(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideB == sideC) {
            return TriangleType.EQUILATERAL.getType();
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return TriangleType.ISOSCELES.getType();
        } else {
            return TriangleType.SCALENE.getType();
        }
    }

}
