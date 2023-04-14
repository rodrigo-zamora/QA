package mx.iteso.triangle.controller;

import mx.iteso.triangle.dto.TriangleDto;
import mx.iteso.triangle.dto.TriangleTypeResponse;
import mx.iteso.triangle.enums.TriangleTypes;
import mx.iteso.triangle.service.TriangleType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

/* This test class tests the controller, doing a direct call to it */
@SpringBootTest
class TriangleTypeControllerTest {

    @Autowired
    private TriangleTypeController triangleTypeController;

    @MockBean
    private TriangleType triangleType;


    @Test
    public void testTriangleTypeServiceGetTriangleType() {
        TriangleDto triangle = new TriangleDto(1L, 1L, 1L);
        when(triangleType.getTriangleType(any())).thenReturn(TriangleTypes.SCALENE);

        ResponseEntity<TriangleTypeResponse> response = triangleTypeController.getTriangleType(triangle);
        assertEquals(HttpStatusCode.valueOf(200),response.getStatusCode());
        assertEquals(TriangleTypes.SCALENE, Objects.requireNonNull(response.getBody()).getType());

    }
}