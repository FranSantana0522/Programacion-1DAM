package packEjA18;

import java.util.Arrays;

public class Pila {
	Integer[] tabla = new Integer[0];

	void apilar(Integer elemento) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
		tabla[0] = elemento;
	}

	void desapilar() {
		System.arraycopy(tabla, 1, tabla, 0, tabla.length - 1);
		tabla = Arrays.copyOf(tabla, tabla.length - 1);
	}

	void mostrar() {
		System.out.println(Arrays.toString(tabla));
	}
}
