package br.com.cod3r.execiciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.cod3r.execiciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	
	
}
