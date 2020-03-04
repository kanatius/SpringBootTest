package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	/*@RequestMapping("/cadastrarProduto")
	public String cadastrarProdutoPage(Produto produto) {
		return "views/cadastrarProduto";
	}*/
	
	@RequestMapping("/cadastrarProduto")
	public String cadastrarProdutoPage(Produto produto, @RequestParam("id") Long id, ModelMap model) {		
		if(id != null && id > 0) {
			produto = produtoService.findById(id);
		}
		model.addAttribute(produto);
		return "views/cadastrarProduto";
	}
	
	
	@GetMapping("/cadastrar")
	public String cadastrarProduto(Produto produto) {
		Estoque estoque = estoqueService.findById((long) 1);
		produto.setEstoque(estoque);
		try {
			produtoService.adicionar(produto);
		}catch(Exception e) {
			System.out.println("ERRO");
		}
		return "redirect:/meuEstoque";
	}
	
	@GetMapping("/editar")
	public String editarProduto(Produto produto) {
		produtoService.atualizar(produto);
		return "redirect:/meuEstoque";
	}
	
	@GetMapping("/remover")
	public String remover(@RequestParam("id") Long id) {
		
		try {
			this.produtoService.remover(id);
		}catch(Exception e) {
			
		}
		return "redirect:/meuEstoque";
	}
}
