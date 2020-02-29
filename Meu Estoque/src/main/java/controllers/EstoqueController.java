package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EstoqueController{
	
	@RequestMapping("/meuEstoque")
	public String meuEstoquePage() {
		return "views/listarProdutos";
	}
}
