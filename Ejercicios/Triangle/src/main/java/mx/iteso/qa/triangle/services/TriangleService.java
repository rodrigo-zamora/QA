package mx.iteso.qa.triangle.services;

@org.springframework.stereotype.Service
public class TriangleService {
    public double getArea(int sideA, int sideB, int sideC) {
        int s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
