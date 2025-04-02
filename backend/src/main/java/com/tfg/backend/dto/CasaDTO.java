package com.tfg.backend.dto;

import lombok.Data;

@Data
public class CasaDTO{
	private Long casaId;
	private String nombre;
	private DireccionDTO direccion;
}
