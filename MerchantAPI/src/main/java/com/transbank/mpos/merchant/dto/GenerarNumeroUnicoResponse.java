package com.transbank.mpos.merchant.dto;

import java.io.Serializable;

public class GenerarNumeroUnicoResponse extends Operacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long numeroUnico;

	public Long getNumeroUnico() {
		return numeroUnico;
	}

	public void setNumeroUnico(Long numeroUnico) {
		this.numeroUnico = numeroUnico;
	}

	@Override
	public String toString() {
		return "GenerarNumeroUnicoResponse [numeroUnico=" + numeroUnico + "]";
	}
	
}
