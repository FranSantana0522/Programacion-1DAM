package pack;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadMenuOrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1-Insercion (en orden)
		// 2-Eliminacion de un elemento leido desde teclado(Busqueda secuencial)
		// 3-Modificacion de un elemento, despues de leer una posicion (Comprobar
		// posicion correcta, eliminarlo y luego insercion nuevo valor)
		// 4-Listado
		// 5-Salir
		Scanner sc = new Scanner(System.in);
		int v[] = new int[0];
		int op;
		do {
			menu();
			do {
				System.out.println("Elige opcion: ");
				op = sc.nextInt();
			} while (!(op >= 1 && op <= 5));
			switch (op) {
			default:
				System.out.println("Has salido");
				break;
			case 1:
				v = insertarDatos(v);
				break;
			case 2:
				v = eliminarDatos(v);
				break;
			case 3:
				v = modificarLeerPosicion(v);
				break;
			case 4:
				System.out.println(Arrays.toString(v));
				break;

			}

		} while (op < 5);
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"¿Cual operacion quieres realizar? \n1-Insercion en orden \n2-Eliminacion de un elemento \n3-Modificacion de un elemento indicado \n4-Listado \n5-Salir ");

	}

	public static int[] insertarDatos(int[] v) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dato: ");
		int n = sc.nextInt();
		int indiceInsercion = Arrays.binarySearch(v, n);
		if (indiceInsercion < 0) {
			indiceInsercion = -indiceInsercion - 1;
		}
		int copia[] = new int[v.length + 1];
		System.arraycopy(v, 0, copia, 0, indiceInsercion);
		System.arraycopy(v, indiceInsercion, copia, indiceInsercion + 1, v.length - indiceInsercion);
		copia[indiceInsercion] = n;
		v = copia;

		return v;
	}

	public static int[] eliminarDatos(int[] v) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dato a eliminar: ");
		int n = sc.nextInt();
		int indiceBorrado = Arrays.binarySearch(v, n);
		if (indiceBorrado >= 0) {
			System.arraycopy(v, indiceBorrado+1, v, indiceBorrado, v.length-indiceBorrado-1);
			v=Arrays.copyOf(v, v.length-1);
		}else {
			
		}
		return v;
	}

	public static int[] modificarLeerPosicion(int[] v) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la posicion a modificar: ");
		int posi = sc.nextInt();
		System.out.println("Introduce el dato nuevo a introducir: ");
		int n = sc.nextInt();
		System.arraycopy(v, posi+1, v, posi, v.length-posi-1);
		v=Arrays.copyOf(v, v.length-1);
		int indiceInsercion = Arrays.binarySearch(v, n);
		if (indiceInsercion < 0) {
			indiceInsercion = -indiceInsercion - 1;
		}
		int copia[] = new int[v.length + 1];
		System.arraycopy(v, 0, copia, 0, indiceInsercion);
		System.arraycopy(v, indiceInsercion, copia, indiceInsercion + 1, v.length - indiceInsercion);
		copia[indiceInsercion] = n;
		v = copia;

		return v;
	}
}
