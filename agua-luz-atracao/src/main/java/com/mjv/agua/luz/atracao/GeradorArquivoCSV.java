package com.mjv.agua.luz.atracao;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class GeradorArquivoCSV {
	
public void escreverDisco ( String conteudoGerado) {
		
		String nomeArquivo = "agua-luz-contratos.csv";
		try {
			File diretorio = new File("C:\\estudo\\GitHub\\mjv-java-shcool\\agua-luz-output");
			if(! diretorio.exists())
				diretorio.mkdirs();
				
			Path path = Paths.get (diretorio.getAbsolutePath(), nomeArquivo );
			
			Files.write(path, conteudoGerado.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}
