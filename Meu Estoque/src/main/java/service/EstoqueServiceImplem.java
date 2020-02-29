package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.EstoqueDaoImplem;
import models.Estoque;

@Service @Transactional
public class EstoqueServiceImplem implements EstoqueService{

	
	@Autowired
	private EstoqueDaoImplem estoqueDao;
	
	@Override
	public void adicionar(Estoque estoque) {
		estoqueDao.save(estoque);
	}

	@Override
	public void remover(Long id) {
		estoqueDao.remove(id);
		
	}

	@Override
	public void atualizar(Estoque estoque) {
		estoqueDao.update(estoque);
	}

	@Override @Transactional(readOnly = true)
	public Estoque findById(Long id) {
		return estoqueDao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Estoque> getAll() {
		return estoqueDao.getAll();
	}

}
