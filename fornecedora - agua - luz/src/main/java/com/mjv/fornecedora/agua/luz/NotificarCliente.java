package com.mjv.fornecedora.agua.luz;

import java.time.LocalDate;

public class NotificarCliente {
		 
	private String nomeCliente;
	private String cpf;
	private Long protocolo;
	private LocalDate data;
	private TipoServico tipo;
	private Double valor;
	
	
	
	public String getNomeCliente() {
		
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Long getProtocolo() {
		return protocolo;
		
	}
	public void setProtocolo(Long protocolo) {
		this.protocolo = protocolo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public TipoServico getTipo() {
		return tipo;
	}
	public void setTipo(TipoServico tipo) {
		this.tipo = tipo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	
}
