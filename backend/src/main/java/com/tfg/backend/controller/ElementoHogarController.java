package com.tfg.backend.controller;

import com.tfg.backend.entity.ElementoHogar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import com.tfg.backend.service.ElementoHogarServiceImpl;

@RestController
@RequestMapping("/api/elementos")
public class ElementoHogarController {

	@Autowired
	private ElementoHogarServiceImpl elementoHogarService;

	@GetMapping
	public ResponseEntity<List<ElementoHogar>> getAllElementos() {
		return ResponseEntity.ok(elementoHogarService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<ElementoHogar> getElementoById(@PathVariable Long id) {
		Optional<ElementoHogar> elemento = elementoHogarService.findById(id);
		return elemento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<ElementoHogar> createElemento(@RequestBody ElementoHogar elemento) {
		ElementoHogar nuevoElemento = elementoHogarService.save(elemento);
		return new ResponseEntity<>(nuevoElemento, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ElementoHogar> updateElemento(@PathVariable Long id, @RequestBody ElementoHogar elemento) {
		if (!elementoHogarService.findById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		ElementoHogar elementoActualizado = elementoHogarService.save(elemento);
		return ResponseEntity.ok(elementoActualizado);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteElemento(@PathVariable Long id) {
		if (!elementoHogarService.findById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		elementoHogarService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
