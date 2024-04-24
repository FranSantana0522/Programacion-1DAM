package pack;

import java.util.Arrays;

public class ActividadesAPlicacion5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t[] = { 10, 1, 5, 8, 9, 2 };
		int numElementos = 3;
		int aux[] = suma(t, numElementos);
		System.out.println("La suma de " + Arrays.toString(t));
		System.out.println("Agrupando " + numElementos + " elementos");
		System.out.println(Arrays.toString(aux));
	}

	public static int[] suma(int t[], int numElementos) {
		int sumas[] = new int[t.length - numElementos + 1];

		for (int i = 0; i < sumas.length; i++) {
			sumas[i] = 0;
			for (int j = 0; j < numElementos; j++) {
				sumas[i] += t[i + j];
			}
		}
		return sumas;
	}

}
