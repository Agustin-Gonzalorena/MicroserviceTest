package com.microservice.estudiante.persistence;

import com.microservice.estudiante.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepo extends JpaRepository<Estudiante, Long> {

    @Query("SELECT e FROM Estudiante e WHERE e.carreraId = :idCarrera")
    List<Estudiante> getAllByCarreraId(Long idCarrera);
}
