package com.microservice.estudiante.service;

import com.microservice.estudiante.entity.Estudiante;
import com.microservice.estudiante.persistence.EstudianteRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private EstudianteRepo estudianteRepo;
    public EstudianteService(EstudianteRepo estudianteRepo) {
        this.estudianteRepo = estudianteRepo;
    }

    public List<Estudiante> getAllByCarrera(Long idCarrera) {
        return this.estudianteRepo.getAllByCarreraId(idCarrera);
    }

    public Estudiante save(Estudiante estudiante) {
        this.estudianteRepo.save(estudiante);
        return estudiante;
    }

}
