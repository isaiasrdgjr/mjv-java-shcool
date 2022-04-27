package com.mjv.agua.luz.atracao;

public enum TipoServico {
	LUZ ("L") ,
	AGUA ("A");
	
	private String servico;
	private TipoServico (String servico) {
		this.servico = servico;
	}
	public String getServico() {
		return servico;
}
}
