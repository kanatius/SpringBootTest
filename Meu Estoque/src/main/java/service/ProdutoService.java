package service;

import java.util.List;

import models.Produto;

public interface ProdutoService {
	void adicionar(Produto produto);
	void remover(Long ID);
	void atualizar(Produto produto);
	
	Produto findById(Long id);
	List<Produto> getAll();
}
