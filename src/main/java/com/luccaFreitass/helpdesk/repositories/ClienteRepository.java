package com.luccaFreitass.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccaFreitass.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
