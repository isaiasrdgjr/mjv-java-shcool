package com.mjv.agua.luz.atracao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;



public class SistemaNotificacaoCliente {
	
	public static void main(String[] args) {
		
		ClienteEndereco notificar = new ClienteEndereco();
		
		notificar.setCpf("007.324.223.21");
		notificar.setRg("33765-5");
		notificar.setNomeCliente("Raimundo Nonato Loureiro Castelo Branco");
		notificar.setCelularCliente("(11)99768-1515");
		notificar.setLogradouro("Rua Sebastião Firmino");
		notificar.setNumero(123);
		notificar.setComplemento("AP 210 BL CENTAURO");  
		notificar.setBairro("São Sebastião");
		notificar.setCidade("São Raimundo Nonato");
		notificar.setUF("Sp");
		notificar.setCep("07.210.715"); 
		notificar.setPais(Paises.BRASIL);
		notificar.setProtocolo(1984365L);
		notificar.setData(LocalDate.of(2022,05,07));
		notificar.setHora(LocalTime.of(15,21));
		notificar.setTipo(TipoServico.AGUA);
		notificar.setValor(127.33);
		notificar.setTipoNotific(TipoNotificacao.SMS);
		
	
		ConteudoNotificacao cn = new ConteudoNotificacao();
		String conteudoGerado = cn.gerador(notificar);
		
		
		
				
	}  

}
