package packEjA21_22;

import java.util.Arrays;

public class Conjunto {
	Integer[] conjunto = new Integer[0];

	boolean insertar(Integer nuevo) {
		boolean encontrado = false;
		boolean modificado = false;
		for (int i = 0; i < conjunto.length && encontrado == false; i++) {
			if (nuevo == conjunto[i]) {
				encontrado = true;
			}
		}
		if (encontrado == false) {
			conjunto = Arrays.copyOf(conjunto, conjunto.length + 1);
			conjunto[conjunto.length - 1] = nuevo;
			modificado = true;
		}
		return modificado;
	}

	int numeroElementos() {
		int elementos = conjunto.length;
		return elementos;
	}

	boolean insertar(Conjunto otroConjunto) {
		int tamaño = conjunto.length;
		boolean encontrado = false;
		for (int i = 0; i < otroConjunto.conjunto.length && encontrado == false; i++) {
			if (otroConjunto.conjunto[i] != conjunto[i]) {
				conjunto = Arrays.copyOf(conjunto, conjunto.length + 1);
				System.arraycopy(otroConjunto.conjunto, i, conjunto, tamaño, 1);

			}
		}
		return encontrado;
	}

	boolean eliminarConjunto(Conjunto otroConjunto) {
		boolean eliminado = false;
		for (int i = 0; i < conjunto.length; i++) {
			if (otroConjunto.conjunto[i] != conjunto[i]) {
				System.arraycopy(conjunto, i + 1, conjunto, i, conjunto.length - i - 1);
				conjunto = Arrays.copyOf(conjunto, conjunto.length - 1);
				eliminado = true;
			}
		}
		return eliminado;
	}

	boolean pertenece(Integer elemento) {
		boolean pertenece = false;
		for (int i = 0; i < conjunto.length && pertenece == false; i++) {
			if (elemento == conjunto[i]) {
				pertenece = true;
			}
		}
		return pertenece;
	}

	boolean eliminarElemento(Integer elemento) {// la condicion de que pertenezca se pone en el main
		boolean eliminado = true;
		int pos = 0;
		for (int i = 0; i < conjunto.length; i++) {
			if (elemento == conjunto[i]) {
				pos = i;
			}
		}
		System.arraycopy(conjunto, pos + 1, conjunto, pos, conjunto.length - pos - 1);
		conjunto = Arrays.copyOf(conjunto, conjunto.length - 1);
		return eliminado;
	}

	void muestra() {
		System.out.println(Arrays.toString(conjunto));
	}

	// COMO RECORRER EL CONJUNTO SIN LENGTH
	static boolean incluido(Conjunto c1, Conjunto c2) {// static sirve para poder declarar otros metodos en este con
														// facilidad
		boolean incluido = true;
		for (int i = 0; i < c1.conjunto.length && incluido == true; i++) {
			if (c2.pertenece(c1.conjunto[i])) {
				incluido = false;// hasta que un elemento no este en otro
			}
		}
		return incluido;
	}

	static Conjunto union(Conjunto c1, Conjunto c2) {
		Conjunto aux = null;
		for (int i = 0; i < c1.conjunto.length; i++) {
			aux.insertar(c1.conjunto[i]);
			aux.insertar(c2.conjunto[i]);
		}
		return aux;
	}

	static Conjunto interseccion(Conjunto c1, Conjunto c2) {
		Conjunto aux = null;
		for (int i = 0; i < c1.conjunto.length; i++) {
			if (incluido(c1, c2)) {

			}
		}
		return aux;
	}

	static Conjunto diferencia(Conjunto c1, Conjunto c2) {// static sirve para poder declarar otros metodos en este con
															// facilidad
		Conjunto aux = null;
		for (int i = 0; i < c1.conjunto.length; i++) {
			if (c2.pertenece(c1.conjunto[i]) == false) {
				aux.insertar(c1.conjunto[i]);
			}
		}
		return aux;
	}
}
