package com.luccaFreitass.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luccaFreitass.helpdesk.domain.Tecnico;
import com.luccaFreitass.helpdesk.repositories.TecnicoRepository;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj  = repository.findById(id);
		return obj.orElse(null);
	}
}
