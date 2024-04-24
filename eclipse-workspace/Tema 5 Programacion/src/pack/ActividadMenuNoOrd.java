package pack;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadMenuNoOrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// OperacionVectorNoOrd
		// 1-Insercion por el final
		// 2-Eliminacion por el final
		// 3-Eliminacion de un elemento leido desde teclado (Busqueda secuencial)
		// 4-Modificacion de un elemento despues de leer una posicion (Comprobar que la
		// posicion es corrcta)
		// 5-Sustituir un valor por otro; si hay repetidos sustituirlos todos (Busqueda
		// secuencial)
		// 6-Listado
		// 7-Salir
		Scanner sc = new Scanner(System.in);
		int v[]=new int [0];
		int op;
		do {
			menu();
			do {
				System.out.println("Elige opcion: ");
				op = sc.nextInt();
			} while (!(op >= 1 && op<=7));
			switch (op) {
			default: System.out.println("Has salido");
			break;
			case 1:
				v=insertarDatos(v);
			break;
			case 2:
				v=eliminarDatos(v);
			break;
			case 3:
				v=eliminarUnDatoSeñalado(v);
			break;
			case 4:
				v=modificarDato(v);
			break;
			case 5:
				v=sustituirDato(v);
			break;
			case 6:
				System.out.println(Arrays.toString(v));
			break;

			}

		} while (op < 7);

	}
	public static void menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Cual operacion quieres realizar? \n1-Insercion por el final \n2-Eliminacion por el final \n3-Eliminacion de un elemento indicado \n4-Modificacion de un elemnto \n5-Sustituir un valor por otro \n6-Listado \n7-Salir ");
		
	}
	public static int[] insertarDatos(int[] v) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce los datos de la tabla");
		int n=sc.nextInt();
		v=Arrays.copyOf(v, v.length+1);
		v[v.length-1]=n;
		return v;
	}
	public static int [] eliminarDatos(int []v) {
		v=Arrays.copyOf(v, v.length-1);
		return v;
	}
	public static int [] eliminarUnDatoSeñalado(int []v) {
		Scanner sc=new Scanner(System.in);
		int indiceBusqueda = 0; 
		System.out.println("Indica el dato a eliminar: ");
		int n=sc.nextInt();
		while (indiceBusqueda < v.length && v[indiceBusqueda] != n) {  
			indiceBusqueda++; 
			} 
		if (indiceBusqueda < v.length) {
			v[indiceBusqueda]=v[v.length-1];
			v=Arrays.copyOf(v, v.length-1);	
			} else {
				
			}
		
		return v;
	}
	public static int [] modificarDato(int []v) {
		Scanner sc=new Scanner(System.in);
		int posi; 
		System.out.println("Indica la posicion a modificar: ");
		posi=sc.nextInt();
		System.out.println("Indica el dato a introducir: ");
		int n=sc.nextInt();
		v[posi]=n;
		return v;
	}
	public static int [] sustituirDato(int []v) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Indica el dato a sustituir: ");
		int n=sc.nextInt();
		System.out.println("Indica el dato a introducir");
		int n2=sc.nextInt();
		for(int i=0;i<v.length;i++) {
			if(v[i]==n) {
				v[i]=n2;
			}
		}
		return v;
	}
}
