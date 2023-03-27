package mx.iteso.triangle.controller;

import jakarta.validation.Valid;
import mx.iteso.triangle.dto.TriangleDto;
import mx.iteso.triangle.dto.TriangleTypeResponse;
import mx.iteso.triangle.service.TriangleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/triangle")
public class TriangleTypeController {

    @Autowired
    private TriangleType triangleType;

    @PostMapping(path="/type")
    ResponseEntity<TriangleTypeResponse> getTriangleType(
            @RequestBody @Valid TriangleDto triangle) {
        return new ResponseEntity<>(TriangleTypeResponse.builder()
                .type(triangleType.getTriangleType(triangle)).build(), HttpStatus.OK);
    }
}
