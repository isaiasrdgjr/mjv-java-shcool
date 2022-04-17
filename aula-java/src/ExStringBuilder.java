
			//Como a classe String é imutável, uma vez declarada não é permitido a alteração de seu valor, existe a classe StringBuilder.

public class ExStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder banda = new StringBuilder ("Charlie"); 
		//Quando alteramos um valor de um objeto da classe String automaticamente é criado um novo objeto.
		// Utilizando a Classe StringBuilder isso não acontece, pois os seus valores são mutáveis. 
		System.out.println(banda);
		
		//para que possamos adicionar caracteres dentro da variável banda utilizamos o método append, ele concatena ou adicionar valores a String criada
		banda.append(" Brown");		
		System.out.println(banda);
		
		//também é possível concatenar variáveis utilizando esse método
		StringBuilder comUltimoNome = new StringBuilder(banda);
		comUltimoNome.append(" Junior");
		System.out.println(comUltimoNome);
		
		
		
	}

}
