package com.mjv.fornecedora.agua.luz;

public enum TipoServico {
	LUZ ("Instalação do serviço de Luz") ,
	AGUA ("Instalação do serviço de água");
	
	private String servico;
	private TipoServico (String servico) {
		this.servico = servico;
	}
	public String getServico() {
		return servico;
}
}
