package packCoches;

import java.util.Arrays;

public class Garaje {

	Coche[] concesionario;

	// inicializamos el array en el constructor
	public Garaje() {
		this.concesionario = new Coche[0];
	}

	public void addCoche(Coche coche) {
		concesionario = Arrays.copyOf(concesionario, concesionario.length + 1);
		concesionario[concesionario.length - 1] = coche;
	}

	public void addColor(String matricula, String color) {// buscarMatricula
		concesionario[buscarMatricula(matricula)].setColor(color);
	}

	public int buscarMatricula(String matricula) {
		boolean encontrado = false;
		int pos = -1;
		for (int i = 0; i < concesionario.length && encontrado == false; i++) {
			if (concesionario[i].getMatricula().equals(matricula)) {
				encontrado = true;
				pos = i;
			}
		}
		return pos;
	}

	public void elimCoche(String matricula) {// buscarMatricula
		int pos = buscarMatricula(matricula);
		System.arraycopy(concesionario, pos + 1, concesionario, pos, concesionario.length - pos - 1);
		concesionario = Arrays.copyOf(concesionario, concesionario.length - 1);
	}

	public int numCoches() {
		int n = 0;
		n = concesionario.length;
		return n;
	}

	public void listadoCompleto() {// MUY IMP
		for (int i = 0; i < concesionario.length; i++) {
			System.out.println((concesionario[i].toString()));// usamos el metodo toString
		}
	}

}
