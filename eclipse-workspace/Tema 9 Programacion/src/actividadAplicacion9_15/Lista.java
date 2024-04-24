package actividadAplicacion9_15;

import java.util.Arrays;

public class Lista implements Pila,ColaDoble{
String []tabla;
	
	public Lista() {
		tabla=new String[0];
	}
	void insertarPrincipio(String nuevo) {
		tabla=Arrays.copyOf(tabla, tabla.length+1);
		System.arraycopy(tabla, 0, tabla, 1, tabla.length-1);
		tabla[0]=nuevo;
	}
	void insertarFinal(String elemento) {
		tabla=Arrays.copyOf(tabla, tabla.length+1);
		tabla[tabla.length-1]=elemento;
	}
	void insertarFinal(Lista otraLista) {
		int tamIni=tabla.length;
		tabla=Arrays.copyOf(tabla, tabla.length+otraLista.tabla.length);
		System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
	}
	void insertar(int posicion,String nuevo) {
		tabla=Arrays.copyOf(tabla, tabla.length+1);
		System.arraycopy(tabla, posicion, tabla, posicion+1, tabla.length-posicion-1);
		tabla[posicion]=nuevo;
	}
	String eliminar(int indice) {
		String eliminado=null;
		if(indice>=0&&indice<tabla.length) {
			eliminado=tabla[indice];
			for(int i=indice+1;i<tabla.length;i++) {
				tabla[i-1]=	tabla[i];
			}
			tabla=Arrays.copyOf(tabla, tabla.length-1);
		}
		return eliminado;
	}
	String get(int indice) {
		String resultado=null;
		if(indice>=0&&indice<tabla.length) {
			resultado=tabla[indice];
		}
		return resultado;
	}
	int buscar(String claveBusqueda) {
		int indice=-1;
		for(int i = 0;i<tabla.length&&indice==-1;i++) {
			if(tabla[i].equals(claveBusqueda)) {
				indice=i;
			}
		}
		return indice;
	}
	public int numElementos() {
		return tabla.length;
	}
	@Override
	public String toString() {
		return "tabla=" + Arrays.toString(tabla);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lista other = (Lista) obj;
		return Arrays.equals(tabla, other.tabla);
	}

	public void encolar(String nuevo) {
		insertarFinal(nuevo);
	}
	@Override
	public String desencolar() {
		// TODO Auto-generated method stub
		return eliminar(0);
	}
	public void apilar(String elemento) {
		insertarFinal(elemento);
	}
	public String desapilar() {
		return eliminar(tabla.length-1);
	}
	public void encolarCabeza(String nuevo) {
		insertarPrincipio(nuevo);
	}
	public String desencolarFinal() {
		return eliminar(0);
	}
	
}
