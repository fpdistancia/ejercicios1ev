package unidad3;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		int h;
		int m;
		int s;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hora: ");
		h = in.nextInt();
		System.out.println("Minuto: ");
		m = in.nextInt();
		System.out.println("Segundo: ");
		s = in.nextInt();
		
		s++;
		if (s == 60) {
			s = 0;
			m++;
			if (m == 60) {
				m = 0;
				h++;
				if (h == 23)
					h = 0;
			}
		}
		
		System.out.println("La hora correspondiente al minuto siguiente es: " + h + ":" + m + ":" + s);
	}

}
