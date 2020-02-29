package service;

import java.util.List;

import models.Estoque;

public interface EstoqueService {
	
	void adicionar(Estoque estoque);
	void remover(Long ID);
	void atualizar(Estoque estoque);
	
	Estoque findById(Long id);
	List<Estoque> getAll();
}
