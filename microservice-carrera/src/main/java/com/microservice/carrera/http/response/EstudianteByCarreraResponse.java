package com.microservice.carrera.http.response;

import com.microservice.carrera.dto.EstudianteDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstudianteByCarreraResponse {

    private String nombreCarrera;
    private List<EstudianteDTO> estudianteDTOList;
}
