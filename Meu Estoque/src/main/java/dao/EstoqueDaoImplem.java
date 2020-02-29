package dao;

import org.springframework.stereotype.Repository;

import dao.interfaces.EstoqueDAO;
import models.Estoque;

@Repository
public class EstoqueDaoImplem extends AbstractDao<Estoque, Long> implements EstoqueDAO{
	
}
