package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int examenM;
		int tarea1M;
		int tarea2M;
		int tarea3M;
		int examenF;
		int tarea1F;
		int tarea2F;
		int examenQ;
		int tarea1Q;
		int tarea2Q;
		int tarea3Q;
		float promedioM;
		float promedioF;
		float promedioQ;
		float promedio;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nota del examen de matemáticas:");
		examenM = Integer.parseInt(in.readLine());
		System.out.println("Nota de la primera tarea de matemáticas:");
		tarea1M = Integer.parseInt(in.readLine());
	}
}
