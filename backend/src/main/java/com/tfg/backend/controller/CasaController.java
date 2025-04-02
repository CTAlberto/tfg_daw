package com.tfg.backend.controller;

import com.tfg.backend.dto.CasaDTO;
import com.tfg.backend.service.CasaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/casa")
@RequiredArgsConstructor
public class CasaController {

	private final CasaService casaService;

	@GetMapping
	public List<CasaDTO> getCasa() {
		//List<CasaDTO> listaCasas = casaService.getCasas();
		return null;
	}
}
