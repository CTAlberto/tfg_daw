package com.tfg.backend.service;

import com.tfg.backend.entity.ElementoHogar;
import com.tfg.backend.repository.ElementoHogarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ElementoHogarServiceImpl { // Renombrado a ElementoHogarServiceImpl

	@Autowired
	private ElementoHogarRepository elementoHogarRepository;

	public List<ElementoHogar> findAll() {
		return elementoHogarRepository.findAll();
	}

	public Optional<ElementoHogar> findById(Long id) {
		return elementoHogarRepository.findById(id);
	}

	public ElementoHogar save(ElementoHogar elemento) {
		return elementoHogarRepository.save(elemento);
	}

	public void deleteById(Long id) {
		elementoHogarRepository.deleteById(id);
	}
}