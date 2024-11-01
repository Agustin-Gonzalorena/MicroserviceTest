package com.microservice.carrera.persistence;

import com.microservice.carrera.entity.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepo extends JpaRepository<Carrera, Long> {
    
}
