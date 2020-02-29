package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "Estoques")
public class Estoque extends EntidadeAbstrata{

	@Column(length = 45)
	String dono;

	@OneToMany(mappedBy = "estoque", cascade = CascadeType.ALL)
	List<Produto> produtos;
	
	
	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
