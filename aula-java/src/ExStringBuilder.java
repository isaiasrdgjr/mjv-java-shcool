
			//Como a classe String � imut�vel, uma vez declarada n�o � permitido a altera��o de seu valor, existe a classe StringBuilder.

public class ExStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder banda = new StringBuilder ("Charlie"); 
		//Quando alteramos um valor de um objeto da classe String automaticamente � criado um novo objeto.
		// Utilizando a Classe StringBuilder isso n�o acontece, pois os seus valores s�o mut�veis. 
		System.out.println(banda);
		
		//para que possamos adicionar caracteres dentro da vari�vel banda utilizamos o m�todo append, ele concatena ou adicionar valores a String criada
		banda.append(" Brown");		
		System.out.println(banda);
		
		//tamb�m � poss�vel concatenar vari�veis utilizando esse m�todo
		StringBuilder comUltimoNome = new StringBuilder(banda);
		comUltimoNome.append(" Junior");
		System.out.println(comUltimoNome);
		
		
		
	}

}
