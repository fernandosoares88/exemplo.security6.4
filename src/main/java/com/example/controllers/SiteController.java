package com.example.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {
	
	
	@GetMapping("/")
	public String index() {
		return "site/index";
	}
	
	@GetMapping("/administrativo")
	@PreAuthorize("hasRole('ADMIN')")
	public String administrativo() {
		return "site/administrativo";
	}
	
	@GetMapping("/estoque")
	@PreAuthorize("hasRole('ESTOQUE')")
	public String estoque() {
		return "site/estoque";
	}
	
	@GetMapping("/vendas")
	@PreAuthorize("hasRole('VENDAS')")
	public String vendas() {
		return "site/vendas";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login/login";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "login/logout";
	}

}
