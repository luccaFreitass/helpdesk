package com.luccaFreitass.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccaFreitass.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
