package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import models.Estoque;
import service.EstoqueServiceImplem;


@Controller
public class EstoqueController{
	
	@Autowired
	EstoqueServiceImplem estoqueService;
	
	
	@RequestMapping("/meuEstoque")
	public String meuEstoquePage(ModelMap model) {
		Estoque estoque = estoqueService.findById((long)1);
		model.addAttribute("produtos",estoque.getProdutos());
		return "views/listarProdutos";
	}
}
