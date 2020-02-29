package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "Produtos")
public class Produto extends EntidadeAbstrata{
	
	
	@Column(length = 255, unique = true)
	private String nome;
	private int quantidade;
	
	@Column(columnDefinition = "money DEFAULT 0.00")
	private float preco;
	
	@ManyToOne
	@JoinColumn(name = "id_estoque_fk", nullable = false)
	private Estoque estoque;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	} 
	
}
