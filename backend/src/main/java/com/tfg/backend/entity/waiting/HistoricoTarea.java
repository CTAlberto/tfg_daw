package com.tfg.backend.entity.waiting;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Historico_Tareas")
public class HistoricoTarea {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long historicoId;

	@ManyToOne
	@JoinColumn(name = "tarea_id", nullable = false)
	private Tarea tarea;

	@Column(nullable = false)
	private String accion;

	private String nombre;
	private String descripcion;
	private Integer prioridad;

	private LocalDateTime fecha = LocalDateTime.now();
}
