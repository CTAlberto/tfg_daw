package com.tfg.backend.entity.waiting;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Tareas")
public class Tarea {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tareaId;

	@Column(nullable = false)
	private String nombre;

	private String descripcion;

	@Column(nullable = false, updatable = false)
	private LocalDateTime fechaCreacion = LocalDateTime.now();

	private LocalDateTime fechaVencimiento;

	@ManyToOne
	@JoinColumn(name = "estado_id")
	private EstadoTarea estado;

	private Integer prioridad;
}
