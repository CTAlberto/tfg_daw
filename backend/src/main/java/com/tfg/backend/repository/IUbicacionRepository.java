package com.tfg.backend.repository;

import com.tfg.backend.entity.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUbicacionRepository extends JpaRepository<Ubicacion, Long> {
}
