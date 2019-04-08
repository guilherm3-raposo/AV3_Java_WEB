package edu.senai.integrador.beans.pessoa;

public enum EEscolaridade {
	FUNDAMENTAL_INCOMPLETO("Ensino fundamental incompleto", "F.I."),
	FUNDAMENTAL_COMPLETO("Ensino fundamental completo", "F.C."), 
	MEDIO_INCOMPLETO("Ensino m�dio incompleto", "M.I."),
	MEDIO_COMPLETO("Ensino m�dio completo", "M.C."), 
	SUPERIOR_INCOMPLETO("Ensino superior incompleto", "S.I."),
	SUPERIOR_COMPLETO("Ensino superior completo", "S.C.");

	private final String descricao;
	private final String sigla;

	private EEscolaridade(String descricao, String sigla) {
		this.descricao = descricao;
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getSigla() {
		return sigla;
	}
}
