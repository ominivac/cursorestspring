package com.algaworks.algafood.service;

import com.algaworks.algafood.model.Cliente;
import com.algaworks.algafood.notificacao.NotificadorEmail;

public class AtivacaoClienteService {

	public void ativar(Cliente cliente) {
		cliente.ativar();
		NotificadorEmail notificadorEmail = new NotificadorEmail();
		notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo");
	}
	
}
