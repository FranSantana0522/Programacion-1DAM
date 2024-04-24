package actividadCoche;

import java.util.Arrays;

public class Garaje {
	Coche[]concesionario;

	//inicializamos el array en el constructor
	public Garaje() {
	this.concesionario=new Coche[0];
	}

	public void addCoche(Coche coche) {
	concesionario=Arrays.copyOf(concesionario, concesionario.length+1);
	concesionario[concesionario.length-1]=coche;
	}
	public int buscarMatricula(String matricula) {
		boolean encontrado = false;
		int pos = -1;
		for (int i = 0; i < concesionario.length && encontrado == false; i++) {
			if (concesionario[i].getMat().equals(matricula)) {
				encontrado = true;
				pos = i;
			}
		}
		return pos;
	}
	public void aumentarKilometraje(String matricula,Integer suma) {// buscarMatricula
		int pos = buscarMatricula(matricula);
		Integer suma1=concesionario[pos].getKilometraje();
		suma1=suma1+suma;
		concesionario[pos].setKilometraje(suma1);
	}

	@Override
	public String toString() {
		return "Garaje [\nCoches\n" + Arrays.toString(concesionario) + "]";
	}
	
}
