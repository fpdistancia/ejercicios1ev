package unidad4;

import java.util.Scanner;

public class Ejercicio5 {

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
//		
//		System.out.println("Introduce tu NIF: ");
//		String nif = in.nextLine();
//		int numero = Integer.parseInt(nif.substring(0, nif.length() - 1));
//		char letra = nif.charAt(nif.length() - 1);
//		int i = numero % 23;
//		if (letra == letras.charAt(i))
//			System.out.println("El nif es correcto");
//		else
//			System.out.println("El nif es incorrecto");
//	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char [] letras = {'T','R','W','A','G','M','Y','F','P','D',
				          'X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		System.out.println("Introduce tu NIF: ");
		String nif = in.nextLine();
		int numero = Integer.parseInt(nif.substring(0, nif.length() - 1));
		char letra = nif.charAt(nif.length() - 1);
		int i = numero % 23;
		if (letra == letras[i])
			System.out.println("El nif es correcto");
		else
			System.out.println("El nif es incorrecto");
	}
	
}
