package edu.senai.integrador.beans.pessoa;

public enum EFuncionarioErro {
	CTPS_INVALIDA("O n�mero da CTPS informado � inv�lido."),
	ESCOLARIDADE_INVALIDA("Escolaridade inv�lida: O valor informado n�o corresponde a nenhuma das op��es."),
	DATA_IDADE_INSUFICIENTE("Idade insuficiente: O funcion�rio deve ter pelo menos 18 anos.");

	private String erro;

	private EFuncionarioErro(String erro) {
		this.erro = erro;
	}

	public String getMensagem() {
		return erro;
	}
}
