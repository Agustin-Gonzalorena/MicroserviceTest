package com.microservice.estudiante.controller;

import com.microservice.estudiante.entity.Estudiante;
import com.microservice.estudiante.service.EstudianteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {
    private EstudianteService estudianteService;
    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Estudiante estudiante) {
        return ResponseEntity.status(HttpStatus.CREATED).body(estudianteService.save(estudiante));
    }

    @GetMapping("/{carreraId}")
    public ResponseEntity<?> getAllByCarreraId(@PathVariable Long carreraId) {
        return ResponseEntity.status(HttpStatus.OK).body(estudianteService.getAllByCarrera(carreraId));
    }

}
