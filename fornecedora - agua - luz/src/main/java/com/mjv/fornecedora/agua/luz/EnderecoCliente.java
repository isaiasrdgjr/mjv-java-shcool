package com.mjv.fornecedora.agua.luz;

public class EnderecoCliente {
	
	static String logradouro;
	static String complemento;
	static String bairro;
	static String cidade;
	static String cep;

	EnderecoCliente(String logradouro, String complemento, String bairro, String cidade, String cep) {
		
		
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		
		
	}
}
