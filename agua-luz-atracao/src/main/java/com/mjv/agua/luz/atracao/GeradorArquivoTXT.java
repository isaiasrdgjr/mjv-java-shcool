package com.mjv.agua.luz.atracao;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class GeradorArquivoTXT {
	
	public void escreverTxt ( String conteudoTxt) {
		
		String nomeArqvo = "agua-luz-contratos.txt";
		try {
			File diretorio = new File("C:\\estudo\\GitHub\\mjv-java-shcool\\agua-luz-output");
			if(! diretorio.exists())
				diretorio.mkdirs();
				
			Path path2 = Paths.get (diretorio.getAbsolutePath(), nomeArqvo );
			
			Files.write(path2, conteudoTxt.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
	
	


