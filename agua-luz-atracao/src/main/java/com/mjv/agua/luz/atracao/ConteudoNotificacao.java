package com.mjv.agua.luz.atracao;

import java.time.LocalDateTime;

public class ConteudoNotificacao {
	
	public String gerador (ClienteEndereco notificacao) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(notificacao.getCpf());
		sb.append(notificacao.getRg());
		sb.append(notificacao.getNomeCliente());
		sb.append(notificacao.getCelularCliente());
		sb.append(notificacao.getLogradouro());
		sb.append(notificacao.getNumero());
		sb.append(notificacao.getComplemento());
		sb.append(notificacao.getBairro());
		sb.append(notificacao.getCidade());
		sb.append(notificacao.getUF());
		sb.append(notificacao.getCep());
		sb.append(notificacao.getPais());
		sb.append(notificacao.getProtocolo());
		sb.append(notificacao.getData().toString().replace("-", "/"));
		sb.append(notificacao.getTipo().getServico());
		sb.append(notificacao.getValor());
		sb.append(notificacao.getTipoNotific());
		
		
		System.out.println(sb);
				
		return sb.toString();
			
	} 
	
	 
}	
	


