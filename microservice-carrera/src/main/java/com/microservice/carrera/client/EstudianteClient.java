package com.microservice.carrera.client;

import com.microservice.carrera.dto.EstudianteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-estudiante",url = "localhost:8080/api/estudiante/")
public interface EstudianteClient {

    @GetMapping("/{carreraId}")
    List<EstudianteDTO> findAllEstudiantesByCarreraId(@PathVariable Long carreraId);
}
