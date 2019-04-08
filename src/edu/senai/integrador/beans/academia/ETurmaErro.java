package edu.senai.integrador.beans.academia;

public enum ETurmaErro {
	ID_INVALIDO("ID informado n�o consta na base de dados!"),
	HORARIO_INICIO("Hor�rio incorreto!"),
	DURACAO("Dura��o inv�lida!");
	
	String mensagem;

	private ETurmaErro(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
