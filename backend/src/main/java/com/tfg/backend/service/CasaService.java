package com.tfg.backend.service;

import com.tfg.backend.dto.CasaDTO;
import com.tfg.backend.entity.Casa;
import com.tfg.backend.repository.ICasaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CasaService {

		private final ICasaRepository casaRepository;

		public Casa obtenerCasaPorId(Long id) {
			return casaRepository.findById(id)
					.orElseThrow(() -> new RuntimeException("Casa no encontrada"));
		}


}
