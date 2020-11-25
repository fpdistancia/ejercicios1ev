package unidad4;

public class Ejercicio12 {

	public static void main(String[] args) {
		int [] v = {6, 2, 3, 0, 1};
		Integer c = centro(v);
		System.out.println(c != null ? ("El centro está en la posicón " + c) : "No tiene centro");
	}
	
	static Integer centro(int [] vector) {
		int c = 0;
		int izda;
		int dcha;
		do {
			c++;
			izda = dcha = 0;
			for (int i=0; i<c; i++)
				izda += (c - i) * vector[i];
			for (int j=c+1; j<vector.length; j++)
				dcha += (j - c) * vector[j];
		} while (izda != dcha && c <= vector.length - 1);
		
		if (c == vector.length - 1)
			return null;
		else 
			return c;
	}

}
