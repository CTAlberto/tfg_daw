package com.tfg.backend.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "elementos_hogar")
public class ElementoHogar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nombre;

	@Column(columnDefinition = "TEXT")
	private String descripcion;

	private String ubicacion;
	private Date fechaAdquisicion;
	private Double precio;

}
