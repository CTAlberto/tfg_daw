package com.tfg.backend.dto;

import lombok.Data;

@Data
public class DireccionDTO {
	private Long direccionId;
	private String calle;
	private String ciudad;
	private String codigoPostal;
	private String pais;

}
