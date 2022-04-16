
public class MetodosString {
	
	
	public static void main(String[] args) {
		String banda = "coldplay";
		String banda1 = "SKANK";
		String banda2 = "    Charlie Brown Jr    ";
		String bandaEx = "";
								//Alguns M�todo
		//length, utilizado para acessar o tamanho de uma string
		System.out.println(banda2.length()); //16
		
		//isEmpty, identifica se a string est� vazia;
		System.out.println("\n" + bandaEx.isEmpty());// true
		System.out.println(banda1.isEmpty());// false
		
		//toUpperCase e toLowerCase, transformam os caracteres em mai�sculo e minusculo
		System.out.println("\n" + banda.toUpperCase());
		System.out.println(banda1.toLowerCase());
		
		//trim, tira os espa�os do in�cio e do final da String
		System.out.println("\n" + banda2);
		System.out.println(banda2.trim());		
	
		
		//substring, recebe um �ndice de come�o e fim
		System.out.println("\n" + banda1);
		System.out.println(banda1.substring(1, 4));
	    
		//replace, busca um caracter e substitui pelo caracter escolhido
		System.out.println("\n" + banda2);
		System.out.println(banda2.replace('C', 'X')); //utilizando char como par�metro n�o permite a troca de 2 caracteres por 1, pois � reconhecido como um posi��o dentro de uma array.
		System.out.println(banda2.replace("Ch", "X")); //utilizando string como par�metro � poss�vel substituir 2 caracteres por 1
		
		//equals compara se os valores da strings s�o iguais
		System.out.println("\n" + banda.equals(banda1));
		System.out.println(banda.equals("Coldplay"));
		System.out.println(banda.equals("coldplay"));
		System.out.println(banda.equalsIgnoreCase("Coldplay"));
		
		//compareTo compara se uma String "vem antes ou depois da outra" por ordem alfab�tica - se vier antes = valor positivo, mesma posi��o = 0 e valor negativo se vier depois
		System.out.println("\n" + banda1.compareTo(banda));
		System.out.println("a".compareTo("A"));
		System.out.println("a".compareToIgnoreCase("A")); //valores minusculos vem antes dos mai�sculos, o IgnoreCase ignora se � mai�sculo ou minusculo
	  }
}
	
		
		

	
