package packEjA13;

import java.util.Arrays;
import java.util.Scanner;

public class Colores {
	String[] colores;
	String paleta[];
	int n;

	public Colores() {
		this.colores = new String[] { "azul", "rojo", "blanco", "negro", "verde", "amarillo" };// IMP
		this.paleta = new String[0];
		this.n = n;
	}

	String[] añadirColores(int n) {
		// boolean encontrado=false;
		int buscar;
		for (int i = 0; i < n; i++) {
			String colorAzar = colores[(int) (Math.random() * colores.length)];
			Arrays.sort(paleta);
			buscar = Arrays.binarySearch(paleta, colorAzar);
			if (buscar < 0) {
				paleta = Arrays.copyOf(paleta, paleta.length + 1);
				paleta[paleta.length - 1] = colorAzar;
			} else {
				n--;
			}
		}

		return paleta;
	}

	void mostrar() {
		System.out.println(Arrays.toString(paleta));
	}
}
