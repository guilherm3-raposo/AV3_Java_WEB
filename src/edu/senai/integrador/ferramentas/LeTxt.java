package edu.senai.integrador.ferramentas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeTxt {

	public static List<String> getLista(String caminhoArquivo) throws IOException {
		File teste = LeitorArquivo.leArquivo(caminhoArquivo);
		BufferedReader arquivo = null;
		List<String> linhas = new ArrayList<String>();
			String linha = "";
			arquivo = new BufferedReader(new FileReader(new File(teste.getAbsolutePath())));
			while ((linha = arquivo.readLine()) != null) {
				linhas.add(linha);
			}
			arquivo.close();
			return linhas;
	}
}
