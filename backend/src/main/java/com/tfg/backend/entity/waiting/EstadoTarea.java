package com.tfg.backend.entity.waiting;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Estado_Tareas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstadoTarea {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long estadoId;

	@Column(nullable = false, unique = true)
	private String nombre;
}
