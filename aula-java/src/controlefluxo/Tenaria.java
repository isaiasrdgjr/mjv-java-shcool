package controlefluxo;

import java.util.Scanner;

public class Tenaria {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o Dia ");
        System.out.println(" 1 - Domingo  ");
        System.out.println(" 2 - 2� Feira ");
        System.out.println(" 3 - 3� Feira ");
        System.out.println(" 4 - 4� Feira ");
        System.out.println(" 5 - 5� Feira ");
        System.out.println(" 6 - 6� Feira ");
        System.out.println(" 7 - S�bado   ");

        int calendario = sc.nextInt();

        String dia = calendario == 7 ? "S�bado" : "Que dia � hoje?";
        System.out.println(dia);

        sc.close();

    }

}
