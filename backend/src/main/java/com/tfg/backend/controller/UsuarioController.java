package com.tfg.backend.controller;

import com.tfg.backend.dto.UsuarioDTO;
import com.tfg.backend.entity.Usuario;
import com.tfg.backend.exceptions.UserAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tfg.backend.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuario")
@RequiredArgsConstructor
public class UsuarioController {

	private final UsuarioService usuarioService;

	@GetMapping("/{id}")
	public UsuarioDTO obtenerUsuario(@PathVariable Long id) {
		return usuarioService.obtenerUsuarioPorId(id);
	}

	@PostMapping
	public ResponseEntity<UsuarioDTO> crearUsuario(
			@RequestParam String nombre,
			@RequestParam String email,
			@RequestParam String password) {


		if (nombre == null || nombre.isEmpty() || email == null || email.isEmpty() || password == null || password.isEmpty()) {
			return ResponseEntity.badRequest().build();  // Devuelve un 400 Bad Request si hay parámetros vacíos
		}

		try {
			// Llamada al servicio para crear el usuario
			UsuarioDTO usuario = usuarioService.crearUsuario(nombre, email, password);
			return ResponseEntity.ok(usuario);  // Devuelve el DTO con el usuario y un código 200 OK
		} catch (UserAlreadyExistsException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body(null);  // Devuelve un 409 Conflict si el usuario ya existe
		}
	}
	/*
	public void actualizarUsuario(Usuario usuario) {
		usuarioService.actualizarUsuario(usuario);
	}

	public void eliminarUsuario(Long id) {
		usuarioService.eliminarUsuario(id);
	}

*/
}
