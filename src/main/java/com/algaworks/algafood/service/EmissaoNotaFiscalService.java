package com.algaworks.algafood.service;

import com.algaworks.algafood.model.Cliente;
import com.algaworks.algafood.model.Produto;
import com.algaworks.algafood.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {
	
	public void emitir(Cliente cliente, Produto produto) {
		
		NotificadorEmail notificadorEmail = new NotificadorEmail();
		notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo");
		
	}

}
