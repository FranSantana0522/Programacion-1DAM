package ejemploBurbujaConSocio;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer opcion;
		TablaSocio tabla=new TablaSocio();
		TablaSocio tabla2=new TablaSocio();
		do {
			System.out.println(
					"1.AltaSocios 1\n2.Ordenar Por Nombre\n3.Ordenar Por Antiguedad\n4.AltaSocios 2\n5.Fusion Socios"
					+ "\n6.Salir");
			opcion = new Scanner(System.in).nextInt();
			switch (opcion) {
			case 1 -> {
				tabla.InsercionOrdenacionSocioId();
				System.out.println(tabla.toString());
			}
			case 2 -> {
				OrdenacionTablaNombre(tabla);
			}
			case 3 -> {
				OrdenacionTablaAntiguedad(tabla);
			}
			case 4->{
				tabla2.InsercionOrdenacionSocioId();
				System.out.println(tabla2.toString());
			}
			case 5->{
				FusionTablasOrdenacionInteger(tabla,tabla2);
			}
			case 6 -> {
				System.out.println("Has salido");
			}
			default -> {
				System.out.println("Elige la opcion correcta");
			}
			}
		} while (opcion != 6);
	}
	static void OrdenacionTablaAntiguedad(TablaSocio tabla) {
		System.out.println("Sin ordenar: ");
		System.out.println(tabla.toString());
		// Metodo de la burbuja ordenacion
		 for (int i = 0; i < tabla.socio.length - 1; i++) {
		        for (int j = i + 1; j < tabla.socio.length; j++) {
				// Con el menor que ordena de menor a mayor , con el mayor que ordena de mayor a
				// menor
				if (tabla.socio[i].antiguedad()-(tabla.socio[j].antiguedad()) < 0) {
					Socio x = tabla.socio[i];
					tabla.socio[i] = tabla.socio[j];
					tabla.socio[j] = x;
				}
			}
		}
		System.out.println("Ordenada: ");
		System.out.println(tabla.toString());
	}
	static void OrdenacionTablaNombre(TablaSocio tabla) {
	    System.out.println("Sin ordenar: ");
	    System.out.println(tabla.toString());
	    // Método de la burbuja ordenación
	    for (int i = 0; i < tabla.socio.length - 1; i++) {
	        for (int j = i + 1; j < tabla.socio.length; j++) {
	            // Con el menor que ordena de menor a mayor
	            if (tabla.socio[i].getNombre().compareTo(tabla.socio[j].getNombre()) > 0) {
	                Socio x = tabla.socio[i];
	                tabla.socio[i] = tabla.socio[j];
	                tabla.socio[j] = x;
	            }
	        }
	    }
	    System.out.println("Ordenada: ");
	    System.out.println(tabla.toString());
	}

	static void FusionTablasOrdenacionInteger(TablaSocio tabla1,TablaSocio tabla2) {
		// Fusionar tablas y ordenar a la vez con metodo de la burbuja
		TablaSocio tabla3 = new TablaSocio();
		tabla3.socio = new Socio[tabla1.socio.length + tabla2.socio.length];
		Integer i = 0, j = 0, k = 0;
		// Metodo de fusion y ordenacion de tablas name=¿metodo de la burbuja?
		while (i < tabla1.socio.length && j < tabla2.socio.length) {
			if (tabla1.socio.length < tabla2.socio.length) {
				tabla3.socio[k] = tabla1.socio[i];
				i++;
			} else {
				tabla3.socio[k] = tabla2.socio[j];
				j++;
			}
			k++;
		}
		while (i < tabla1.socio.length) {
			tabla3.socio[k] = tabla1.socio[i];
			i++;
			k++;
		}
		while (j < tabla2.socio.length) {
			tabla3.socio[k] = tabla2.socio[j];
			j++;
			k++;
		}
		System.out.println(tabla3.toString());
	}
}
