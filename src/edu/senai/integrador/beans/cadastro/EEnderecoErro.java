package edu.senai.integrador.beans.cadastro;

public enum EEnderecoErro {
	LOGRADOURO_INVALIDO("O c�digo informado n�o corresponde a um logradouro"),
	ENDERECO_VAZIO("O endereco informado n�o pode estar vazio"),
	ENDERECO_INVALIDO("Endere�o inv�lido: Informe n�meros por extenso"),
	COMPLEMENTO_VAZIO("O complemento informado n�o pode estar vazio"), NUMERO_INVALIDO("O n�mero informado � invalido");

	private String erro;

	private EEnderecoErro(String erro) {
		this.erro = erro;
	}

	public String getErro() {
		return erro;
	}
}
