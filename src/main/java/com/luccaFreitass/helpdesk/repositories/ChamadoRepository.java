package com.luccaFreitass.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccaFreitass.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
