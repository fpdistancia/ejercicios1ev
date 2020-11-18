package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int [] vector;
		System.out.println("Introduce la dimensión del vetor (10<=dim<=1.000.000):");
		int dim = in.nextInt();
		vector = new int[dim];
		long t0 = System.currentTimeMillis();
		for (int i=0; i<vector.length; i++) {
			int j;
			int n;
			do {
				n = r.nextInt(2000000) - 999999;
				j = 0;
				while (j < i && vector[j] != n) 
					j++;
			} while (j != i);
			vector[i] = n;
		}
		long t1 = System.currentTimeMillis() - t0;
		System.out.println("Tamaño del vector: " + vector.length);
		System.out.println("Tiempo empleado en llenarlo: " + t1 + " milisegundos");
		t0 = System.currentTimeMillis();
		int dif = 0;
		
 		t1 = System.currentTimeMillis() - t0;
 		System.out.println("Diferencia entre el valor mayor y el menor: " + dif);
		System.out.println("Tiempo empleado en calcular la diferencia: " + t1 + "milisegundos");
	}

}
