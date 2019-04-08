package edu.senai.integrador.beans.cadastro;

import edu.senai.integrador.logs.GeraLog;
import edu.senai.integrador.seguranca.IMensagemException;

public class ContatoException extends Exception implements IMensagemException {

	private static final long serialVersionUID = 1L;

	
	private final EContatoErro mensagem;
	
	public ContatoException(EContatoErro erro) {
		mensagem = erro;
		GeraLog log = new GeraLog();
		log.escreveLogArquivo(erro);
	}
	
	public String getMensagem() {
		return this.mensagem.toString();
	}
}
