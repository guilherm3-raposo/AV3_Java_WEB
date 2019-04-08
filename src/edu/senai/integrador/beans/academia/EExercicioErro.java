package edu.senai.integrador.beans.academia;

public enum EExercicioErro {
	EXERCICIO_INVALIDO("O exercicio informado � inv�lido!"),
	SERIE_INVALIDA("Os valores informados s�o inv�lidos!"),
	REPETICAO_INVALIDA("Os valores informados s�o inv�lidos!"),
	CARGA_INVALIDA("Os valores informados s�o inv�lidos!"),
	TREINO_INVALIDO("Os valores informados s�o inv�lidos!");

	private String erro;

	private EExercicioErro(String erro) {
		this.erro = erro;
	}

	public String getErro() {
		return erro;
	}
}
