package com.algaworks.algafood.di;

import com.algaworks.algafood.model.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente("Joao", "joao@xyz.com", "54544545");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "11212455");
		
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService();
		ativacaoClienteService.ativar(joao);
		ativacaoClienteService.ativar(maria);
	}
	
}
