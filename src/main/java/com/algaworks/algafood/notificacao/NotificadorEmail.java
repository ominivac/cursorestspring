package com.algaworks.algafood.notificacao;

import com.algaworks.algafood.model.Cliente;

public class NotificadorEmail {

	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificacao %s atraves do email %s: %s\n", 
				cliente.getNome() , cliente.getEmail(), mensagem );
	
		
	}
	
}
