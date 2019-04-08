package edu.senai.integrador.bancodedados.conexao;

public enum EConexaoErro {
	ABRE_CONEXAO("Erro de Conex�o: N�o foi poss�vel estabelecer conex�o com o Banco de Dados."),
	FECHA_CONEXAO("Erro de Conex�o: N�o foi poss�vel fechar a conex�o com o Banco de Dados.");

	private final String mensagem;


	private EConexaoErro(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
