package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int x = in.nextInt();
		if (x % 2 == 0)
			System.out.println("el número es par");
		else
			System.out.println("el número es impar");
	}

}
