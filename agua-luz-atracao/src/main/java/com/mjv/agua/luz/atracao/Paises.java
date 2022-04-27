package com.mjv.agua.luz.atracao;

public enum Paises {
	
	BRASIL ("BR"),
	CAMAROES ("CM"),
	ESPANHA ("ES");
	
	private String siglaPais;
	private Paises (String siglaPais) {
		this.siglaPais = siglaPais;
	}
	public String getSiglaPais() {
		return siglaPais;

	}
}

