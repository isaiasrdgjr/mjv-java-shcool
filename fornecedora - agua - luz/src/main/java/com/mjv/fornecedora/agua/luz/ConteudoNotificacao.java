package com.mjv.fornecedora.agua.luz;

import java.time.LocalDateTime;

public class ConteudoNotificacao {
	
	public String gerador (NotificarCliente notificacao) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Senhor(a) " + notificacao.getNomeCliente());
		sb.append(" cpf de número " + notificacao.getCpf() + ",");
		sb.append(" informamos que conforme contrato com protocolo de número " + notificacao.getProtocolo()+"\n");
		sb.append("está agendado para a data/hora ");
		sb.append(notificacao.getData().toString().replace("-", "/"));
		sb.append(" a " + notificacao.getTipo().getServico());
		sb.append(" com taxa de valor R$" + notificacao.getValor());
		sb.append(" em sua residência localizada no endereço abaixo:\n\n");
		
		sb.append("Logradouro: " + EnderecoCliente.logradouro + "\n");
		sb.append("Complemento: " + EnderecoCliente.complemento + "\n");
		sb.append("Bairro: " + EnderecoCliente.bairro + "\n");
		sb.append("Cidade: " + EnderecoCliente.cidade + "\n");
		sb.append("Cep: " + EnderecoCliente.cep);
		
		System.out.println(sb);
		
		return sb.toString();
		
		/*sb.append(movimentacao.getData().toString().replace("-", "")); 
		sb.append(String.format("%014d", Long.valueOf(movimentacao.getCpfCnpj().replaceAll("\\D", ""))) );
		
		String nome = movimentacao.getNomeCliente();
		//System.out.println(nome);
		
		if(nome.length() >= 30)
			sb.append(nome.substring(0,30) );
		else {
			sb.append(String.format("%-30s", nome) );
		}
		sb.append(String.format("%010d", Long.valueOf(movimentacao.getValor().toString().replaceAll("\\D", ""))) );
		
		sb.append(movimentacao.getTipo().getSigla());
		
		if(movimentacao.getEstornada())
			sb.append("1");
		else
			sb.append("0");
		return sb.toString();
	}
*/
}

}
