package mx.iteso.qa.triangle.enums;

public enum TriangleType {

    EQUILATERAL("Equilateral"),
    ISOSCELES("Isosceles"),
    SCALENE("Scalene");

    private String type;

    TriangleType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
