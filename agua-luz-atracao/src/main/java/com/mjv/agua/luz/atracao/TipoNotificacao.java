package com.mjv.agua.luz.atracao;

public enum TipoNotificacao {
	
	SMS ("S"),
	WHATS ("W");
	
	private String mensagem;
	private TipoNotificacao (String mensagem) {
		this.mensagem = mensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
}
