package br.com.jhonicosta.erp.resource;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jhonicosta.erp.domain.Usuario;
import br.com.jhonicosta.erp.domain.enums.TipoUsuario;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> list = new ArrayList<>();
		Usuario user1 = new Usuario("1", "Jhoni Costa", 
				"jhonirsc@gmail.com", "521.803.850-48", TipoUsuario.ADMINISTRATIVO, "paçoca");
		
		Usuario user2 = new Usuario("2", "Maria da Silva", 
				"maria@gmail.com", "971.235.390-79", TipoUsuario.OPERACIONAL, "bolo de cenoura");
		
		list.addAll(Arrays.asList(user1, user2));
		return ResponseEntity.ok().body(list);
	}
}
