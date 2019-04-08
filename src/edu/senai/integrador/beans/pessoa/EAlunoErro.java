package edu.senai.integrador.beans.pessoa;

public enum EAlunoErro {
	DATA_IDADE_INSUFICIENTE("O aluno deve ter pelo menos 16 anos"), 
	ALTURA_INVALIDA("A altura informada � inv�lida"),
	PESO_INVALIDO("O peso informado � inv�lido");

	private String erro;

	private EAlunoErro(String erro) {
		this.erro = erro;
	}

	public String getMensagem() {
		return erro;
	}
}
