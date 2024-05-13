package com.luccaFreitass.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luccaFreitass.helpdesk.domain.Chamado;
import com.luccaFreitass.helpdesk.domain.Cliente;
import com.luccaFreitass.helpdesk.domain.Tecnico;
import com.luccaFreitass.helpdesk.enums.Perfil;
import com.luccaFreitass.helpdesk.enums.Prioridade;
import com.luccaFreitass.helpdesk.enums.Status;
import com.luccaFreitass.helpdesk.repositories.ChamadoRepository;
import com.luccaFreitass.helpdesk.repositories.ClienteRepository;
import com.luccaFreitass.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "89099767056", "valdir@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "92937732011", "torvalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado01", "Primeiro Chamado", tec1, cli1);	
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
