package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		String nombre;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long t0 = System.currentTimeMillis();
		System.out.println("Teclea tu nombre: ");
		nombre = in.readLine();
		long t1 = System.currentTimeMillis() - t0;
		long segundos = t1 / 1000;
		long milis = t1 % 1000;
		System.out.printf("Hola %s, has tardado %d,%3d segundos en decirme tu nombre", nombre, segundos, milis);
	}

}
