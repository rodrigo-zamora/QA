package mx.iteso.qa.triangle.controllers;

import mx.iteso.qa.triangle.services.TriangleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/triangle")
public class TriangleController {

    @Autowired
    private TriangleService triangleService;

    @GetMapping("/area")
    public double getArea(int sideA, int sideB, int sideC) {
        return triangleService.getArea(sideA, sideB, sideC);
    }

    @GetMapping("/type")
    public String getType(int sideA, int sideB, int sideC) {
        return triangleService.getType(sideA, sideB, sideC);
    }

}
