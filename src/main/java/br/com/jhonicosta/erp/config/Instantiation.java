package br.com.jhonicosta.erp.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.jhonicosta.erp.domain.Usuario;
import br.com.jhonicosta.erp.repository.UsuarioRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {

		usuarioRepository.deleteAll();
		
		Usuario usuario1 = new Usuario(null, "Jhoni Costa", "jhoni@gmail.com", "37873862038", "Administrador", "123");
		Usuario usuario2 = new Usuario(null, "Leticia da Silva", "leticia@gmail.com", "37873862038", "Operacional", "123");
		Usuario usuario3 = new Usuario(null, "Alessandra Xaviar", "alex@gmail.com", "37873862038", "Operacional", "123");
	
		usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2, usuario3));
	}

}
