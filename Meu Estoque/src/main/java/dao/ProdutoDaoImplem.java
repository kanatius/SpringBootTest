package dao;

import org.springframework.stereotype.Repository;

import dao.interfaces.ProdutoDAO;
import models.Produto;

@Repository
public class ProdutoDaoImplem extends AbstractDao<Produto, Long> implements ProdutoDAO{

}
