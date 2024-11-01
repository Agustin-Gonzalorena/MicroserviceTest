package com.microservice.carrera.controller;

import com.microservice.carrera.entity.Carrera;
import com.microservice.carrera.service.CarreraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/carrera")
public class CarreraController {
    private CarreraService carreraService;
    public CarreraController(CarreraService carreraService) {
        this.carreraService = carreraService;
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Carrera carrera) {
        return ResponseEntity.status(HttpStatus.CREATED).body(carreraService.save(carrera));
    }

    @GetMapping("")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(carreraService.getAllCarreras());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(carreraService.findById(id));
    }

    @GetMapping("/get-estudiantes/{carreraId}")
    public ResponseEntity<?> getCarrerasConEstudiantes(@PathVariable Long carreraId) {
        return ResponseEntity.status(HttpStatus.OK).body(carreraService.getEstudiantesAnotados(carreraId));
    }
}
