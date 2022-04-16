
public class MetodosString {
	
	
	public static void main(String[] args) {
		String banda = "coldplay";
		String banda1 = "SKANK";
		String banda2 = "    Charlie Brown Jr    ";
		String bandaEx = "";
								//Alguns Método
		//length, utilizado para acessar o tamanho de uma string
		System.out.println(banda2.length()); //16
		
		//isEmpty, identifica se a string está vazia;
		System.out.println("\n" + bandaEx.isEmpty());// true
		System.out.println(banda1.isEmpty());// false
		
		//toUpperCase e toLowerCase, transformam os caracteres em maiúsculo e minusculo
		System.out.println("\n" + banda.toUpperCase()); //COLDPLAY
		System.out.println(banda1.toLowerCase()); //skank
		
		//trim, tira os espaços do início e do final da String
		System.out.println("\n" + banda2);//     Charlie Brown Jr
		System.out.println(banda2.trim());//Charlie Brown Jr		
	
		
		//substring, recebe um índice de começo e fim
		System.out.println("\n" + banda1);// SKANK
		System.out.println(banda1.substring(1, 4));//KAN
	    
		//replace, busca um caracter e substitui pelo caracter escolhido
		System.out.println("\n" + banda2);
		System.out.println(banda2.replace('C', 'X')); //utilizando char como parâmetro não permite a troca de 2 caracteres por 1, pois é reconhecido como um posição dentro de uma array. = Xharlie Brown Jr
		System.out.println(banda2.replace("Ch", "X")); //utilizando string como parâmetro é possível substituir 2 caracteres por 1 = Xarlie Brown Jr
		
		//equals compara se os valores da strings são iguais
		System.out.println("\n" + banda.equals(banda1));//false
		System.out.println(banda.equals("Coldplay"));//false
		System.out.println(banda.equals("coldplay"));//true
		System.out.println(banda.equalsIgnoreCase("Coldplay"));//true
		
		//compareTo compara se uma String "vem antes ou depois da outra" por ordem alfabética - se vier antes = valor positivo, mesma posição = 0 e valor negativo se vier depois
		System.out.println("\n" + banda1.compareTo(banda));//-16
		System.out.println("a".compareTo("A"));//32
		System.out.println("a".compareToIgnoreCase("A")); //0
		//valores minusculos vem antes dos maiúsculos, o IgnoreCase ignora se é maiúsculo ou minusculo
	  }
}
	
		
		

	
