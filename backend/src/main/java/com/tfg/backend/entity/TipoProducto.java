package com.tfg.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Tipos_Producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tipo_producto_id")
	private Long tipoProductoId;

	@Column(name = "nombre",nullable = false)
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
}
