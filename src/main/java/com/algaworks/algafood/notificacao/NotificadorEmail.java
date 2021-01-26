package com.algaworks.algafood.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.model.Cliente;

@Component
public class NotificadorEmail {
	
	public NotificadorEmail() {
		System.out.println("NotificadorEmail");
	}
	

	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificacao %s atraves do email %s: %s\n", 
				cliente.getNome() , cliente.getEmail(), mensagem );
	
		
	}
	
}
