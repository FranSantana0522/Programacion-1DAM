package aplicacion10_21;

import java.util.Arrays;

public class Agenda {
	public Contactos[] agenda = new Contactos[0];

	public Agenda() {
		this.agenda = new Contactos[0];
	}

	void insertarFinal(Object nuevo) {
		agenda = Arrays.copyOf(agenda, agenda.length + 1);
		agenda[agenda.length - 1] = (Contactos) nuevo;
	}
	public String getNombre(int n) {
		return agenda[n].name;
	}
	public Integer getTelefono(int n) {
		return agenda[n].tlf;
	}
	public void busqueda(String n) {
		for(int i=0;i<agenda.length;i++) {
			if(agenda[i].name.contains(n)) {
				System.out.println(agenda[i]);
			}
		}
	}
	Object get(int indice) {
		Object resultado = null;
		if (indice >= 0 && indice < agenda.length) {
			resultado = agenda[indice];
		}
		return resultado;
	}

	int buscar(Object claveBusqueda) {
		int indice = -1;
		for (int i = 0; i < agenda.length && indice == -1; i++) {
			if (agenda[i].equals(claveBusqueda)) {
				indice = i;
			}
		}
		return indice;
	}

	public Contactos[] getAgenda() {
		return agenda;
	}

	public void setAgenda(Contactos[] agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "Agenda [\n" + Arrays.toString(agenda) + "]";
	}

}
