package com.tfg.backend.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Casas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Casa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long casaId;

	@Column(nullable = false)
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "direccion_id")
	private Direccion direccion;
}
