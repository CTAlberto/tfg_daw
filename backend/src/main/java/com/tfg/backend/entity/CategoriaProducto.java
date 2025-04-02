package com.tfg.backend.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.*;

@Entity
@Table(name = "Categorias_Producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoria_id")
	private Long categoriaId;

	@Column(nullable = false, unique = true)
	private String nombre;
}
