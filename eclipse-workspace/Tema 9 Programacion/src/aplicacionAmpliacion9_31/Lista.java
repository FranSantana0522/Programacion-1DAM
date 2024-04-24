package aplicacionAmpliacion9_31;

import java.util.Arrays;
import java.util.Comparator;

import actividadAplicacion9_11.ColaDoble;
import actividadAplicacion9_11.Pila;

public class Lista implements Pila,ColaDoble{
	 Object tabla [];
	    Lista () {
	    tabla=new Object [0];
	    }
	    void insertarPrincipio (Object nuevo) {
	        tabla = Arrays.copyOf (tabla, tabla.length + 1);
	        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
	        tabla [0] = nuevo;
	    }
	    void insertarFinal (Object nuevo) {
	    tabla = Arrays.copyOf (tabla, tabla.length + 1);
	    tabla [tabla.length - 1] = nuevo;
	    }
	    void insertarFinal (Lista otraLista) {
	        int tamIni=tabla.length;//tamaÃ±o inicial tabla
	        tabla = Arrays.copyOf (tabla, tabla.length + otraLista.tabla.length);
	        System.arraycopy (otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
	    }
	    void insertar (int posicion, Object nuevo) {
	    tabla = Arrays.copyOf (tabla, tabla.length + 1);
	    System.arraycopy (tabla, posicion, tabla, posicion + 1,
	    tabla.length - posicion - 1);
	    tabla[posicion] = nuevo;
	    }
	    Object eliminar (int indice) {
	        Object eliminado = null;
	        if (indice >= 0 && indice< tabla.length) {
	        eliminado=tabla [indice];
	        }
	        for (int i = indice + 1; i < tabla.length; i++) {
	        tabla [i - 1] = tabla [i];
	        }
	        tabla = Arrays.copyOf (tabla, tabla.length - 1);
	        return eliminado;
	    }
	Object get (int indice) {
	        Object resultado = null;
	        if (indice >= 0 && indice < tabla.length) {//Ã­ndice vÃ¡lido
	        resultado = tabla [indice];
	        }
	        return resultado;
	    }
	    int buscar (Object claveBusqueda) {
	        int indice = -1;
	        for (int i = 0; i < tabla.length && indice == -1; i++) {
	            if (tabla [i].equals (claveBusqueda)) {
	            indice = i;
	            }
	        }
	        return indice;
	    }
	    public String toString() {//mostramos la tabla
	        return Arrays.deepToString (tabla);
	    }
	    void ordenar() {
	        Arrays.sort(tabla);
	    }
	    void ordenar(Comparator c) {
	        Arrays.sort(tabla,c);
	    }
		@Override
		public void encolar(Object o) {
			// TODO Auto-generated method stub
			insertarFinal(o);
		}
		@Override
		public Object desencolar() {
			// TODO Auto-generated method stub
			return eliminar(0);
		}
		@Override
		public void encolarCabeza(String nuevo) {
			// TODO Auto-generated method stub
			insertarPrincipio(nuevo);
		}
		@Override
		public String desencolarFinal() {
			// TODO Auto-generated method stub
			return (String) eliminar(0);
		}
		@Override
		public void apilar(Object elemento) {
			// TODO Auto-generated method stub
			insertarFinal(elemento);
		}
		@Override
		public Object desapilar() {
			// TODO Auto-generated method stub
			return eliminar(0);
		}
	}
