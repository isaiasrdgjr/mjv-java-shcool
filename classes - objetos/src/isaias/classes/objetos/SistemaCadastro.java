package isaias.classes.objetos;

public class SistemaCadastro {

	public static void main(String[] args) {
		
			Pessoa pessoa1 = new Pessoa("000001007" , "Isaias");
			
			System.out.println(pessoa1.endereco);
			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.cpf +"\n");
	

	
			Pessoa pessoa2 = new Pessoa("0000000012" , "Carol" , "Rio de Janeiro");
			
			System.out.println(pessoa2.endereco);
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.cpf);
	}				
}
