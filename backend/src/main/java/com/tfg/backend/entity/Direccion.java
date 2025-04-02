package com.tfg.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Direcciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "direccion_id")
	private Long direccionId;
	@Column(name = "calle", nullable = false)
	private String calle;
	@Column(name = "numero")
	private String numero;
	@Column(name = "extra")
	private String extra;
	@Column(name = "ciudad")
	private String ciudad;
	@Column(name = "estado")
	private String estado;
	@Column(name = "codigo_postal")
	private String codigoPostal;
	@Column(name = "pais")
	private String pais;

}

