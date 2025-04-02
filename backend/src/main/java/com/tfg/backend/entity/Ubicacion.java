package com.tfg.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Ubicaciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ubicacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ubicacion_id")
	private Long ubicacionId;

	@Column(name = "nombre",nullable = false)
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
}
