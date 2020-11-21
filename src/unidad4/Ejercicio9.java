package unidad4;

public class Ejercicio9 {

	public static void main(String[] args) {
		int[] vector = new int[(int) (Math.round(Math.random() * 490) + 10)];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.round(Math.random() * 200) - 100);
			if (vector.length <= 50)
				System.out.print(vector[i] + " ");
		}
		if (vector.length <= 50)
			System.out.println();
		System.out.println("Se han detectado " + secuenciasDeNumerosRepetidos(vector) + " secuencias de números repetidos");
	}

	static int secuenciasDeNumerosRepetidos(int[] vector) {
		int secuencias = 0;
		boolean secuenciaDetectada = false;
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] == vector[i - 1]) {
				if (!secuenciaDetectada) {
					secuenciaDetectada = true;
					secuencias++;
				}
			} else if (secuenciaDetectada)
				secuenciaDetectada = false;
		}
		return secuencias;
	}

}
