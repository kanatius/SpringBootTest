package dao.interfaces;

import java.util.List;

import models.Estoque;

public interface EstoqueDAO {

	public void save(Estoque objeto);
	public void remove(Long id);
	public void update(Estoque objeto);
	public Estoque findById(Long id);
	public List<Estoque> getAll();
	
}
