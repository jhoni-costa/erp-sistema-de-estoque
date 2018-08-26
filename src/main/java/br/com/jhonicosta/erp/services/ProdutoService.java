package br.com.jhonicosta.erp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jhonicosta.erp.domain.Produto;
import br.com.jhonicosta.erp.dto.ProdutoDTO;
import br.com.jhonicosta.erp.repository.ProdutoRepository;
import br.com.jhonicosta.erp.resources.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public List<Produto> findAll() {
		return repository.findAll();
	}

	public Produto findById(String id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public Produto insert(Produto obj) {
		return repository.insert(obj);
	}

	public Produto fromDTO(ProdutoDTO dto) {
		return new Produto(dto.getId(), dto.getNome(), dto.getDescricao(), dto.getBarCode(), dto.getPreco());
	}

	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
}
