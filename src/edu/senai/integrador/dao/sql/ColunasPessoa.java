package edu.senai.integrador.dao.sql;

import java.util.Properties;

import edu.senai.integrador.ferramentas.Configuracoes;

public class ColunasPessoa {
	Configuracoes config = new Configuracoes();
	Properties prop = config.carrega(false);
	private String[] tags = LeXml.getTag("colunasPessoa", "/colunasSQL.xml");

	public final String CPF 		 = (tags[0]);
	public final String NOME 		 = (tags[1]);
	public final String ESTAD0_CIVIL = (tags[2]);
	public final String SEXO		 = (tags[3]);
	public final String DATA_NASC	 = (tags[4]);
	public final String ATIVO 		 = (tags[5]);
}
