package mx.iteso.triangle.service;

import mx.iteso.triangle.dto.TriangleDto;
import mx.iteso.triangle.enums.TriangleTypes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TriangleTypeTest {

    @Autowired
    private TriangleType triangleType;

    @Test
    public void testScaleneTriangle() {
        TriangleDto scalene = new TriangleDto(2L,3L,4L);
        TriangleTypes type = triangleType.getTriangleType(scalene);
        assertEquals(TriangleTypes.SCALENE, type);
    }

    @Test
    public void testIsoscelesTriangle() {
        TriangleDto isosceles = new TriangleDto(2L,2L,3L);
        TriangleTypes type = triangleType.getTriangleType(isosceles);
        assertEquals(TriangleTypes.ISOSCELES, type);
    }

    @Test
    public void testEquilateralTriangle() {
        TriangleDto equilateral = new TriangleDto(2L,2L,2L);
        TriangleTypes type = triangleType.getTriangleType(equilateral);
        assertEquals(TriangleTypes.EQUILATERAL, type);
    }

    @Test
    public void testNotTriangle() {
        TriangleDto notTriangle = new TriangleDto(1L,1L,4L);
        TriangleTypes type = triangleType.getTriangleType(notTriangle);
        assertNull(type);
    }

    @Test
    public void testNullTriangle() {
        TriangleDto nullTriangle = null;
        TriangleTypes type = triangleType.getTriangleType(nullTriangle);
        assertNull(type);
    }

    @Test
    public void testZeroTriangle() {
        TriangleDto zeroTriangle = new TriangleDto(0L,0L,0L);
        TriangleTypes type = triangleType.getTriangleType(zeroTriangle);
        assertNull(type);
    }

    @Test
    public void testNegativeTriangle() {
        TriangleDto negativeTriangle = new TriangleDto(-1L,-1L,-1L);
        TriangleTypes type = triangleType.getTriangleType(negativeTriangle);
        assertNull(type);
    }

    @Test
    public void testNullSideATriangle() {
        TriangleDto nullSideATriangle = new TriangleDto(null,1L,1L);
        TriangleTypes type = triangleType.getTriangleType(nullSideATriangle);
        assertNull(type);
    }

    @Test
    public void testNullSideBTriangle() {
        TriangleDto nullSideBTriangle = new TriangleDto(1L,null,1L);
        TriangleTypes type = triangleType.getTriangleType(nullSideBTriangle);
        assertNull(type);
    }

    @Test
    public void testNullSideCTriangle() {
        TriangleDto nullSideCTriangle = new TriangleDto(1L,1L,null);
        TriangleTypes type = triangleType.getTriangleType(nullSideCTriangle);
        assertNull(type);
    }

    @Test
    public void testIsValidTriangle() {
        TriangleDto validTriangle = new TriangleDto(1L,1L,1L);
        assertTrue(validTriangle.isValidTriangle());
    }

    @Test
    public void testIsNotValidTriangle() {
        TriangleDto notValidTriangle = new TriangleDto(1L,1L,4L);
        assertFalse(notValidTriangle.isValidTriangle());
    }


    @Test
    public void testToString() {
        TriangleDto triangle = new TriangleDto(1L,1L,1L);
        assertEquals("TriangleDto(sideA=1, sideB=1, sideC=1)", triangle.toString());
    }

    @Test
    public void testEquals() {
        TriangleDto triangle = new TriangleDto(1L,1L,1L);
        TriangleDto triangle2 = new TriangleDto(1L,1L,1L);
        assertEquals(triangle, triangle2);
    }

    @Test
    public void testHashCode() {
        TriangleDto triangle = new TriangleDto(1L,1L,1L);
        TriangleDto triangle2 = new TriangleDto(1L,1L,1L);
        assertEquals(triangle.hashCode(), triangle2.hashCode());
    }

    @Test
    public void testNotEquals() {
        TriangleDto triangle = new TriangleDto(1L,1L,1L);
        TriangleDto triangle2 = new TriangleDto(1L,1L,2L);
        assertNotEquals(triangle, triangle2);
    }

    @Test
    public void testNotEqualsNull() {
        TriangleDto triangle = new TriangleDto(1L,1L,1L);
        TriangleDto triangle2 = null;
        assertNotEquals(triangle, triangle2);
    }

    @Test
    public void testNotEqualsDifferentClass() {
        TriangleDto triangle = new TriangleDto(1L,1L,1L);
        String triangle2 = "TriangleDto(sideA=1, sideB=1, sideC=1)";
        assertNotEquals(triangle, triangle2);
    }

    @Test
    public void testNotEqualsDifferentSideA() {
        TriangleDto triangle = new TriangleDto(1L,1L,1L);
        TriangleDto triangle2 = new TriangleDto(2L,1L,1L);
        assertNotEquals(triangle, triangle2);
    }

    @Test
    public void testNotEqualsDifferentSideB() {
        TriangleDto triangle = new TriangleDto(1L,1L,1L);
        TriangleDto triangle2 = new TriangleDto(1L,2L,1L);
        assertNotEquals(triangle, triangle2);
    }

    @Test
    public void testNotEqualsDifferentSideC() {
        TriangleDto triangle = new TriangleDto(1L,1L,1L);
        TriangleDto triangle2 = new TriangleDto(1L,1L,2L);
        assertNotEquals(triangle, triangle2);
    }
}