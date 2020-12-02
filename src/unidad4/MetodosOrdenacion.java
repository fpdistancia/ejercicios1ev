package unidad4;

import java.util.Arrays;

public class MetodosOrdenacion {

	public static void insercionDirecta(int [] v) {
		for (int i=1; i<v.length; i++) {
			int j = 0;
			while (j < i && v[i] > v[j])
				j++;
			if (j < i) {
				int aux = v[i];
				for (int k=i-1; k>=j; k--)
					v[k+1] = v[k];
				v[j] = aux;
			}
		}
	}
	
	public static void seleccionDirecta(int [] v) {
		
	}
	
	public static void intercambioDirecto(int [] v) {
		
	}
		
	public static void main(String[] args) {
		int [] v = {2, 5, 9, 1, 14, 21, 7, 33, 8};
		insercionDirecta(v);
		System.out.println(Arrays.toString(v));
	}
}