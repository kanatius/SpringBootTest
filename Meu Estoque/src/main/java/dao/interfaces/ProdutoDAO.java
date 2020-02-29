package dao.interfaces;

import java.util.List;

import models.Produto;

public interface ProdutoDAO {
	public void save(Produto objeto);
	public void remove(Long id);
	public void update(Produto objeto);
	public Produto findById(Long id);
	public List<Produto> getAll();
}
