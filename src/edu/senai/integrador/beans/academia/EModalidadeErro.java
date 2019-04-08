package edu.senai.integrador.beans.academia;

public enum EModalidadeErro {
	MODALIDADE_INVALIDA("A modalidade informada � inv�lida!"),
	SEMANA_INVALIDA("Os valores informados s�o inv�lidos!"),
	MINIMO_INVALIDO("O valor informado � inv�lido!");

	private String erro;

	private EModalidadeErro(String erro) {
		this.erro = erro;
	}

	public String getErro() {
		return erro;
	}
}
