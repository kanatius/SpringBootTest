package models;

import java.util.ArrayList;

public class Estoque {
ArrayList<Produto> produtos;
	
	Estoque() {
		this.produtos = new ArrayList<Produto>();
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}	
	
}
