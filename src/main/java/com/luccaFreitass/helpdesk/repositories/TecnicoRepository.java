package com.luccaFreitass.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccaFreitass.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
