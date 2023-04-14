package mx.iteso.triangle.controller;

import mx.iteso.triangle.enums.TriangleTypes;
import mx.iteso.triangle.service.TriangleType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/* This test class tests the controller class using a mock MVC controller */
@ExtendWith(SpringExtension.class)
@WebMvcTest(TriangleTypeController.class)
public class TriangleTypeMVCTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    TriangleType triangleType;

    @Test
    public void testGetTypeMVC() throws Exception {
        when(triangleType.getTriangleType(any())).thenReturn(TriangleTypes.EQUILATERAL);

        String triangleJson = "{\"sideA\":1,\"sideB\":1,\"sideC\":1}";
        /* This call passes through the verify process */
        mvc.perform(MockMvcRequestBuilders.post("/type")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .content(triangleJson))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.type")
                        .value("EQUILATERAL"));

        when(triangleType.getTriangleType(any())).thenReturn(TriangleTypes.ISOSCELES);
    }
}
