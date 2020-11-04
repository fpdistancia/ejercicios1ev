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
		System.out.println("Nota de la segunda tarea de matemáticas:");
		tarea2M = Integer.parseInt(in.readLine());
		System.out.println("Nota de la tercera tarea de matemáticas:");
		tarea3M = Integer.parseInt(in.readLine());
		
		System.out.println("Nota del examen de física:");
		examenF = Integer.parseInt(in.readLine());
		System.out.println("Nota de la primera tarea de física:");
		tarea1F = Integer.parseInt(in.readLine());
		System.out.println("Nota de la segunda tarea de física:");
		tarea2F = Integer.parseInt(in.readLine());
		
		System.out.println("Nota del examen de química:");
		examenQ = Integer.parseInt(in.readLine());
		System.out.println("Nota de la primera tarea de química:");
		tarea1Q = Integer.parseInt(in.readLine());
		System.out.println("Nota de la segunda tarea de química:");
		tarea2Q = Integer.parseInt(in.readLine());
		System.out.println("Nota de la tercera tarea de química:");
		tarea3Q = Integer.parseInt(in.readLine());
		
		promedioM = examenM * 0.9f + ((tarea1M + tarea2M + tarea3M) / 3) * 0.1f;
		promedioF = examenF * 0.8f + ((tarea1F + tarea2F) / 3) * 0.2f;
		promedioQ = examenQ * 0.85f + ((tarea1Q + tarea2Q + tarea3Q) / 3) * 0.15f;
		
		promedio = (promedioM + promedioF + promedioQ) / 3;
		
		System.out.printf("Promedio de matemáticas: %4.2f\n", promedioM);
		System.out.printf("Promedio de física: %4.2f\n", promedioF);
		System.out.printf("Promedio de química: %4.2f\n", promedioQ);
		System.out.printf("Promedio de las tres asignaturas: %4.2f\n", promedio);
	}
}
