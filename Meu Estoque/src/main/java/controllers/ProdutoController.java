package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import models.Estoque;
import models.Produto;
import service.EstoqueServiceImplem;
import service.ProdutoServiceImplem;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	ProdutoServiceImplem produtoService;
	
	@Autowired
	EstoqueServiceImplem estoqueService;
	
	@GetMapping("/cadastrar")
	public String cadastrarProduto(Produto produto) {
		Estoque estoque = estoqueService.findById((long) 1);
		System.out.println(estoque.toString());
		produto.setEstoque(estoque);
		produtoService.adicionar(produto);
		return "redirect:/meuEstoque";
	}
	
	
}
