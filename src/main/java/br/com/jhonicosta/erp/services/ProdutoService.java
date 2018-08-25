package br.com.jhonicosta.erp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jhonicosta.erp.domain.Produto;
import br.com.jhonicosta.erp.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;

	public List<Produto> findAll(){
		return repository.findAll();
	}

}
