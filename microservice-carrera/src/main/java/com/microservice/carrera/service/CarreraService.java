package com.microservice.carrera.service;

import com.microservice.carrera.client.EstudianteClient;
import com.microservice.carrera.dto.EstudianteDTO;
import com.microservice.carrera.entity.Carrera;
import com.microservice.carrera.http.response.EstudianteByCarreraResponse;
import com.microservice.carrera.persistence.CarreraRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraService {
    private CarreraRepo carreraRepo;
    private EstudianteClient estudianteClient;
    public CarreraService(CarreraRepo carreraRepo, EstudianteClient estudianteClient) {
        this.carreraRepo = carreraRepo;
        this.estudianteClient = estudianteClient;
    }

    public List<Carrera> getAllCarreras() {
        return carreraRepo.findAll();
    }

    public Carrera save(Carrera carrera) {
        carreraRepo.save(carrera);
        return carrera;
    }

    public Carrera findById(Long id) {
        return carreraRepo.findById(id).get();
    }

    public EstudianteByCarreraResponse getEstudiantesAnotados(Long idCarrera) {
        Carrera c = carreraRepo.findById(idCarrera).get();

        List<EstudianteDTO> estudianteDTOList = estudianteClient.findAllEstudiantesByCarreraId(idCarrera);

        return EstudianteByCarreraResponse.builder()
                .nombreCarrera(c.getNombre())
                .estudianteDTOList(estudianteDTOList)
                .build();
    }

}
