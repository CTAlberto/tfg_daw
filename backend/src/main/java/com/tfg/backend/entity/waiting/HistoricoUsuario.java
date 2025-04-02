package com.tfg.backend.entity.waiting;

import com.tfg.backend.entity.Usuario;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Historico_Usuarios")
public class HistoricoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long historicoId;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;

	@Column(nullable = false)
	private String accion;

	private String nombre;
	private String email;

	private LocalDateTime fecha = LocalDateTime.now();
}
