package com.mjv.fornecedora.agua.luz;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class NotificarCliente {
	
			 
	private String nomeCliente;
	private String cpf;
	private Long protocolo;
	private LocalDateTime data;
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
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime localDateTime) {
		this.data = localDateTime;
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
