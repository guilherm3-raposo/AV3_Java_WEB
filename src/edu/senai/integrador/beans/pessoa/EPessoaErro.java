package edu.senai.integrador.beans.pessoa;

public enum EPessoaErro {
	CPF_FORMATO_INVALIDO("O CPF informado � inv�lido!"),
	CPF_TAMANHO_INVALIDO("O CPF informado deve conter 11 caracteres!"), 
	NOME_CARACTERES_INVALIDOS		("O nome informado deve conter apenas letras e espa�os!"),
	NOME_TAMANHO("O nome informado dever conter entre 6 e 45 caracteres!"),
	NOME_INVALIDO("O nome informado cont�m caracteres inv�lidos!"),
	SEXO_INVALIDO("O sexo informado deve  ser M ou F!"),
	ESTADO_CIVIL_INVALIDO("Estado Civil Inv�lido: O valor informado n�o corresponde a nenhuma das op��es");

	private String erro;

	private EPessoaErro(String erro) {
		this.erro = erro;
	}

	public String getMensagem() {
		return erro;
	}
}
