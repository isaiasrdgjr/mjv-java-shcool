package com.mjv.agua.luz.atracao;

import java.time.LocalDateTime;

public class ConteudoNotificacao {
	
	public String gerador (ClienteEndereco notificacao) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("%011d", Long.valueOf(notificacao.getCpf().replace("." , ""))) + ";");
		sb.append(String.format(notificacao.getRg())+ ";");
				
		String nome = notificacao.getNomeCliente();
		//System.out.println(nome);
		
		if(nome.length() >= 30)
			sb.append(nome.substring(0,30).toUpperCase() + ";");
		else {
			sb.append(String.format("%-30s", nome).toUpperCase() + ";");
			
		}
		
		sb.append(String.format("%011d", Long.valueOf(notificacao.getCelularCliente().replaceAll("\\D" , "")))+ ";");
		sb.append(notificacao.getLogradouro().toUpperCase().substring(0,20)+ ";");
		sb.append(String.format("%06d", notificacao.getNumero())+ ";");
		sb.append(notificacao.getComplemento().toUpperCase().substring(0,10)+ ";");
		
		
		
		String Bairro = notificacao.getBairro();
		
		
		if(Bairro.length() >= 15)
			sb.append(Bairro.substring(0,15).toUpperCase().trim() + ";");
		else {
			sb.append(String.format("%-15s", Bairro).toUpperCase().trim() + ";");
		}
		
		
		
		String city = notificacao.getBairro();
				
		if(city.length() >= 30)
			sb.append(city.substring(0,30).toUpperCase().trim() + ";");
		else {
			sb.append(String.format("%-30s", city).toUpperCase().trim() + ";");
		}
		
		
		
		sb.append(notificacao.getUF().toUpperCase().substring(0,2)+ ";");
		sb.append(String.format("%08d", Long.valueOf(notificacao.getCep().replace("." , "")))+ ";");
		sb.append(notificacao.getPais().getSiglaPais()+ ";");
		sb.append(String.format("%010d", notificacao.getProtocolo())+ ";");
		sb.append(notificacao.getData().toString().replace("-", "")+ ";");
		sb.append(notificacao.getTipo().getServico()+ ";");
		sb.append(String.format("%08d", Long.valueOf(notificacao.getValor().toString().replaceAll("\\D" , ""))) + ";");
		sb.append(notificacao.getTipoNotific().getMensagem());
		
		
		System.out.println(sb);
		
		return sb.toString();

		
	} 
	
	 
}	
	


