package br.com.jhonicosta.erp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.jhonicosta.erp.domain.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

	
}
