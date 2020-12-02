package unidad4;

public class Ejercicio9 {

	public static void main(String[] args) {
//		int[] vector = new int[(int) (Math.round(Math.random() * 490) + 10)];
//		for (int i = 0; i < vector.length; i++) {
//			vector[i] = (int) (Math.round(Math.random() * 200) - 100);
//			if (vector.length <= 50)
//				System.out.print(vector[i] + " ");
//		}
//		if (vector.length <= 50)
//			System.out.println();
		int [] v = {2,2,3,3,3};
		System.out.println("Se han detectado " + secuenciasDeNumerosRepetidos(v) + " secuencias de números repetidos");
	}

	static int secuenciasDeNumerosRepetidos(int[] vector) {
		int secuencias = 0;
		boolean serepite = false;
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] == vector[i - 1]) {
				if (!serepite) {
					serepite = true;
					secuencias++;
				}
			} else if (serepite)
				serepite = false;
		}
		return secuencias;
	}

}
