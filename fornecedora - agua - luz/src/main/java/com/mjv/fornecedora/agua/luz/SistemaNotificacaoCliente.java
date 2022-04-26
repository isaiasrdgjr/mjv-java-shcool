package com.mjv.fornecedora.agua.luz;

import java.time.LocalDateTime;



public class SistemaNotificacaoCliente {
	
	public static void main(String[] args) {
		
		NotificarCliente notificar = new NotificarCliente();
		
		notificar.setNomeCliente("Gleyson Sampaio");
		notificar.setCpf("234.765.987-27");
		notificar.setProtocolo(2022025687L);
		notificar.setData(LocalDateTime.of(2022,02,21,16,00,00));
		notificar.setTipo(TipoServico.AGUA);
		notificar.setValor(127.33);
		
				
		EnderecoCliente endereco = new EnderecoCliente ("Rua das Marias, 243", "Ap 207, Bloco C"
			, "Santo Antonio", "São Paulo / SP", "27.310-657");

		ConteudoNotificacao cn = new ConteudoNotificacao();
		String conteudoGerado = cn.gerador(notificar);
		
		
		
				
	}  

}
