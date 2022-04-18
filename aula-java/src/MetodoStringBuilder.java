
public class MetodoStringBuilder {

	public static void main(String[] args) {
		StringBuilder banda = new StringBuilder("Charlie Brown Junior");
		
					//Alguns metodos StringBuilder
		
		//metodo reverse, esse metodo inverte todos os caracteres de um string
		banda.reverse(); //para executar descomente o inicio da linha
		System.out.println(banda);
		banda.reverse();
		
		//metodo insert, insere caracter de acordo com o par�metro que for definido
		banda.insert(7, " COLDPLAY ");
		System.out.println(banda);
		
		//metodo delete, deleta caracter de acordo com o par�metro que for definido
		banda.delete(8, 18);
		System.out.println(banda);
		
				
					//Os metodos utilizados na classe String tb s�o utilizados na classe StringBuilder, trim, charAt, length, entre outros
		
					//OBS: o m�todo substring ou subSequence n�o altera o valor da string, ele devolve o valor com uma string nova.
		
		

	}

}
