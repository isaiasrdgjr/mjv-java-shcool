package com.mjv.fornecedora.agua.luz;

public enum TipoServico {
	LUZ ("Instala��o do servi�o de Luz") ,
	AGUA ("Instala��o do servi�o de �gua");
	
	private String servico;
	private TipoServico (String servico) {
		this.servico = servico;
	}
	public String getServico() {
		return servico;
}
}
