package edu.senai.integrador.z.populadores;

public enum ENomes {
	UM("Ana", "Ambr�sio", "Aquino"), 
	DOIS("Beatriz", "Berenice", "Barros"), 
	TRES("Carla", "Castro", "Cardoso"),
	QUATRO("Diana", "DiMalo", "Dinklage"), 
	CINCO("Esther", "Elara", "Elsa"), 
	SEIS("Fabiana", "Figueira", "Foga�a"),
	SETE("Gabriela", "Gen�zio", "Gomes"), 
	OITO("Helo�sa", "Hermann", "Hemmer"), 
	NOVE("Ilara", "Ismael", "Irma"),
	DEZ("Janete", "Jonas", "Jill");

	private String nome;
	private String segundoNome;
	private String terceiroNome;

	private ENomes(String nome, String segundoNome, String terceiroNome) {
		this.nome = nome;
		this.segundoNome = segundoNome;
		this.terceiroNome = terceiroNome;
	}

	public String getNome() {
		return nome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public String getTerceiroNome() {
		return terceiroNome;
	}

}
