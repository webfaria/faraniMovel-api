package com.farani.mobile.domain.enums;

public enum TipoPagamento {

	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");

	private int cod;
	private String descricao;
	
	private TipoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static TipoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for (TipoPagamento pagamento : TipoPagamento.values()) {
			if(cod.equals(pagamento.getCod())) {
				return pagamento;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
