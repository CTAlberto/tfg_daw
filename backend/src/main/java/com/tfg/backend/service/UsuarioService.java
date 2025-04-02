package com.tfg.backend.service;

import com.tfg.backend.converter.UsuarioConverter;
import com.tfg.backend.dto.UsuarioDTO;
import com.tfg.backend.entity.Casa;
import com.tfg.backend.entity.Usuario;
import com.tfg.backend.exceptions.UserAlreadyExistsException;
import com.tfg.backend.repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UsuarioService {

	private final IUsuarioRepository usuarioRepository;
	private final UsuarioConverter usuarioConverter;

	public UsuarioDTO obtenerUsuarioPorId(Long id) {
		Usuario usuario = usuarioRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
		Casa casa = usuario.getCasa();
		return new UsuarioDTO(usuario.getUsuarioId(), usuario.getNombre(), usuario.getEmail(), casa);
	}

	@Transactional
	public UsuarioDTO crearUsuario(String nombre, String email, String password) {
		// Verificación de usuario existente
		Usuario usuario = usuarioRepository.findByEmail(email);
		if (usuario != null) {
			throw new UserAlreadyExistsException("El usuario con este correo electrónico ya existe.");
		}

		// Creación de nuevo usuario
		usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setEmail(email);

		// Cifrado de la contraseña
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		usuario.setPassword(encoder.encode(password));

		usuarioRepository.save(usuario);

		// Conversión a DTO
		return usuarioConverter.toDTO(usuario);
	}

}
