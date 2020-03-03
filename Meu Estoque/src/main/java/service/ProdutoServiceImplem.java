package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ProdutoDaoImplem;
import models.Produto;

@Service @Transactional
public class ProdutoServiceImplem implements ProdutoService{

	@Autowired
	private ProdutoDaoImplem produtoDao;
	
	
	@Override
	public void adicionar(Produto produto) {
		produtoDao.save(produto);
	}

	@Override
	public void remover(Long id) {
		produtoDao.remove(id);
		
	}

	@Override
	public void atualizar(Produto produto) {
		produto.setEstoque(produtoDao.findById(produto.getId()).getEstoque());
		produtoDao.update(produto);
	}

	@Override @Transactional(readOnly = true)
	public Produto findById(Long id) {
		return produtoDao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Produto> getAll() {
		return produtoDao.getAll();
	}

}
