package com.tfg.backend.dto;

import com.tfg.backend.entity.Casa;
import com.tfg.backend.entity.Direccion;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UsuarioDTO {
	private Long usuarioId;
	private String nombre;
	private String email;
	private Casa casa;

	public UsuarioDTO(Long usuarioId, String nombre, String email, Casa casa) {
		this.usuarioId = usuarioId;
		this.nombre = nombre;
		this.email = email;
		this.casa = casa;
	}
}
