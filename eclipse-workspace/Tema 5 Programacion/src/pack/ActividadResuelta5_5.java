package pack;

import java.util.Arrays;

public class ActividadResuelta5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	static int[] rellenaPares(int longitud, int fin) {
		int pares[] = new int[longitud];
		int i = 0;
		while (i < pares.length) {
			int n = (int) (Math.random() * fin + 1);
			if (n % 2 == 0) {
				pares[i] = n;
				i++;
			}
		}
		Arrays.sort(pares);
		return (pares);
	}
}