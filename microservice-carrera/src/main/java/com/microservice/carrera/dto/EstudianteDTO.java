package com.microservice.carrera.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteDTO {

    private Long dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private Long carreraId;
}
