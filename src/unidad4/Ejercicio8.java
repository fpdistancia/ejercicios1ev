package unidad4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un tamaño para el vector entre 10 y 200: ");
		int n = in.nextInt();
		while (n < 10 || n > 200) {
			System.out.println("Incorrecto, el tamaño tiene que estar entre 10 y 200. Vuelve a introducirlo: ");
			n = in.nextInt();
		}
		in.close();
		
		int [] vector = new int[n];
		for (int i=0; i<vector.length; i++)
			vector[i] = (int) (Math.round(Math.random() * 200) - 100);
		
		int suma = 0;
		int parcial = 0;
		int nosumar = 0;
		int nosumados = 0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i] == 13 && nosumar == 0) {
				nosumar = 14;
				parcial = 0;
				System.out.print("{ ");
			}
			System.out.print(vector[i] + " ");
			if (nosumar == 0)
				suma += vector[i];
			else {
				parcial += vector[i];
				if (--nosumar == 0) {
					if (parcial == 7)
						suma += parcial;
					else
						nosumados += 14;
					System.out.print("} ");
				}
			}
		}
		System.out.println();
		if (nosumar > 0) {
			if (parcial == 7)
				suma += parcial;
			else
				nosumados = 14 - nosumar;
		}
		
		System.out.println("Suma: " + suma);
		System.out.println("No sumados: " + nosumados);
	}
	
	

}
