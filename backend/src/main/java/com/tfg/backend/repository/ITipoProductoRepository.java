package com.tfg.backend.repository;

import com.tfg.backend.entity.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoProductoRepository extends JpaRepository<TipoProducto, Long> {
}
