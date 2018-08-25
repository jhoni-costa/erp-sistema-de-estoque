package br.com.jhonicosta.erp.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.jhonicosta.erp.domain.Produto;
import br.com.jhonicosta.erp.domain.Usuario;
import br.com.jhonicosta.erp.repository.ProdutoRepository;
import br.com.jhonicosta.erp.repository.UsuarioRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {

		usuarioRepository.deleteAll();
		
		Usuario usuario1 = new Usuario(null, "Jhoni Costa", "jhoni@gmail.com", "37873862038", "Administrador", "123");
		Usuario usuario2 = new Usuario(null, "Leticia da Silva", "leticia@gmail.com", "37873862038", "Operacional", "123");
		Usuario usuario3 = new Usuario(null, "Alessandra Xaviar", "alex@gmail.com", "37873862038", "Operacional", "123");
	
		usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2, usuario3));
		
		produtoRepository.deleteAll();
		
		Produto prod1 = new Produto(null, "Coca-cola 2L", "Refrigerante Coca-Cola, Garafa PET de 2l", "7598759428", 3.99);
		Produto prod2 = new Produto(null, "Cerveja Skol", "Fardo com 12 latas de 350ml", "298457389", 12.99);
		Produto prod3 = new Produto(null, "Café 3 Corações", "Embalagem a vacuo, 500g", "8045898293", 5.99);
		
		produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
	}

}
