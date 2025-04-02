package com.tfg.backend.converter;

import com.tfg.backend.dto.UsuarioDTO;
import com.tfg.backend.entity.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioConverter {

	public UsuarioDTO toDTO(Usuario usuario) {
		return new UsuarioDTO(usuario.getUsuarioId(), usuario.getNombre(), usuario.getEmail(), usuario.getCasa());
	}

	public Usuario toEntity(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setUsuarioId(usuarioDTO.getUsuarioId());
		usuario.setNombre(usuarioDTO.getNombre());
		usuario.setEmail(usuarioDTO.getEmail());
		usuario.setCasa(usuarioDTO.getCasa());
		return usuario;
	}
}
