package edu.senai.integrador.seguranca;

public class SegurancaException extends Exception implements IMensagemException {
	private static final long serialVersionUID = 1L;
	
	String erro = "Serial informado � inv�lido!";
	
	@Override
	public String getMensagem() {
		return erro;
	}
	
	@Override
	public String toString() {
		return this.erro; 
	}
}
