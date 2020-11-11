package unidad3;

import java.util.Scanner;

public class Multiplicar {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		solucionA();
	}
		
	static boolean deseaContinuar(String pregunta) {
		System.out.println(pregunta);
		String respuesta = in.nextLine();
		return respuesta.equalsIgnoreCase("s");
	}
	
	static void solucionA() {
		int tabla;
		int resultado;
		int resultadoCorrecto;
		int fallos;
		while (deseaContinuar("Deseas repasar una tabla de multiplicar (s/n): ")) {
			System.out.println("¿Qué tabla deseas repasar? (Teclea el número)");
			tabla = Integer.parseInt(in.nextLine());
			fallos = 0;
			for (int i=1; i <= 9; i++) {
				resultadoCorrecto = tabla * i;
				System.out.println("¿" + tabla + " x " + i + "?");
				resultado = Integer.parseInt(in.nextLine());
				if (resultado == resultadoCorrecto) {
					System.out.println("Correcto");
				}
				else {
					fallos++;
					System.out.println("Incorrecto. El resultado correcto es " + resultadoCorrecto);
				}
			}
			
			if (fallos < 2) {
				System.out.println("Has aprobado");
			}
			else {
				System.out.println("Has suspendido");
			}			
		}
	}

	
	static void solucionB() {
		int tabla;
		int resultado;
		int resultadoCorrecto;
		int fallos;
		do {
			System.out.println("¿Qué tabla deseas repasar? (Teclea el número)");
			tabla = Integer.parseInt(in.nextLine());
			fallos = 0;
			for (int i=1; i <= 9; i++) {
				resultadoCorrecto = tabla * i;
				System.out.println("¿" + tabla + " x " + i + "?");
				resultado = Integer.parseInt(in.nextLine());
				if (resultado == resultadoCorrecto) {
					System.out.println("Correcto");
				}
				else {
					fallos++;
					System.out.println("Incorrecto. El resultado correcto es " + resultadoCorrecto);
				}
			}
			if (fallos < 2) {
				System.out.println("Has aprobado");
			}
			else {
				System.out.println("Has suspendido");
			}
		} while (deseaContinuar("Deseas repasar otra tabla de multiplicar (s/n): "));

	}
	
	static void solucionC() {
		int tabla;
		int resultado;
		int resultadoCorrecto;
		int fallos;
		
		for (;deseaContinuar("Deseas repasar una tabla de multiplicar (s/n): ");) {
			System.out.println("¿Qué tabla deseas repasar? (Teclea el número)");
			tabla = Integer.parseInt(in.nextLine());
			fallos = 0;
			for (int i=1; i <= 9; i++) {
				resultadoCorrecto = tabla * i;
				System.out.println("¿" + tabla + " x " + i + "?");
				resultado = Integer.parseInt(in.nextLine());
				if (resultado == resultadoCorrecto) {
					System.out.println("Correcto");
				}
				else {
					fallos++;
					System.out.println("Incorrecto. El resultado correcto es " + resultadoCorrecto);
				}
			}
			
			if (fallos < 2) {
				System.out.println("Has aprobado");
			}
			else {
				System.out.println("Has suspendido");
			}			
		}
	}
}
