package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import models.Produto;

@Controller
public class indexController {

	@RequestMapping("/")
	public String index() {
		return "redirect:/meuEstoque";
	}
	
	@RequestMapping("/cadastrarProduto")
	public String cadastrarProdutoPage(Produto produto) {
		return "views/cadastrarProduto";
	}
	
}
