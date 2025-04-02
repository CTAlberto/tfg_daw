package com.tfg.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Productos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "producto_id")
	private Long productoId;
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "stock")
	private Integer stock;
	@Column(name = "precio")
	private Double precio;

	@ManyToOne
	@JoinColumn(name = "tipo_cantidad_id")
	private TipoCantidad tipoCantidad;
	@ManyToOne
	@JoinColumn(name = "ubicacion_id")
	private Ubicacion ubicacion;
	@ManyToOne
	@JoinColumn(name = "tipo_producto_id")
	private TipoProducto tipoProducto;
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private CategoriaProducto categoria;
	@ManyToOne
	@JoinColumn(name = "casa_id")
	private Casa casa;
}
