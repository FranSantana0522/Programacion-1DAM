package packEjA18;

import java.util.Arrays;

public class Cola {
	// insercion por el final
	// eliminacion por el principio
	Integer[] tabla = new Integer[0];

	void encolar(Integer elemento) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = elemento;
	}

	void desencolar() {
		System.arraycopy(tabla, 1, tabla, 0, tabla.length - 1);
		tabla = Arrays.copyOf(tabla, tabla.length - 1);
	}

	void mostrar() {
		System.out.println(Arrays.toString(tabla));
	}

}