package edu.senai.integrador.beans.cadastro;

public enum EContatoErro {
	EMAIL_INVALIDO("O valor informado n�o corresponde a um email v�lido"),
	NUMERO_INVALIDO("O n�mero informado � invalido");

	private String erro;

	private EContatoErro(String erro) {
		this.erro = erro;
	}

	public String getErro() {
		return erro;
	}
}
