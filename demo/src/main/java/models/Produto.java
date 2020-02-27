package models;

public class Produto {
	String nome;
	int quantidade;
	float preco;
	
	Produto(String nome, int quantidade, float preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
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
	
	
	
	
}
