       //ALGUNS EXEMPLOS

public class StringCriacao {

	public static void main(String[] args) {
		
		//tradicional
		
		String bandaX = "Coldplay";
		String bandaY = new String ("Coldplay");
		
				//criando string c/ arrays de char
		
				char [] bandaExemplo = new char [] {'S','K','A','N','K'};
				String banda = new String (bandaExemplo);
		
				System.out.println(bandaY);
				System.out.println("\n" + banda);
		
		//criando string c/StringBuilder
		
		StringBuilder banda1 = new StringBuilder("Charlie Brown Jr");
		String banda2 = new String (banda1);
		
		System.out.println("\n" + banda2);
		
			//String é imutável, não é possível alterar o seu valor e sim criar uma nova
		
	}
}