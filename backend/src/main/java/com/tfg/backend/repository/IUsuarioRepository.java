package com.tfg.backend.repository;

import com.tfg.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByEmail(String email);
}
