package br.com.jhonicosta.erp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jhonicosta.erp.domain.Usuario;
import br.com.jhonicosta.erp.dto.UsuarioDTO;
import br.com.jhonicosta.erp.repository.UsuarioRepository;
import br.com.jhonicosta.erp.resources.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public Usuario findById(String id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public Usuario insert(Usuario obj) {
		return repository.insert(obj);
	}

	public Usuario fromDTO(UsuarioDTO dto) {
		return new Usuario(dto.getId(), dto.getNome(), dto.getEmail(), dto.getCpf(), dto.getTipo(), dto.getSenha());
	}

	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
}
