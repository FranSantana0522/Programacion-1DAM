package actividadCoche;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Coche c;
		Garaje conc = new Garaje();
		int op = 0;
		do {
			menu();
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Insertar matricula coche: ");
				String mat=sc.next();
				System.out.println("Inserta color del coche: ");
				String color=sc.next();
				System.out.println("Kilometraje del coche: ");
				Integer km=sc.nextInt();
				c=new Coche(mat,color,km);
				conc.addCoche(c);
				break;
			case 2:
				System.out.println("Matricula del coche que quiere sumar: ");
				String mat2=sc.next();
				System.out.println("Cuanto le quieres sumar: ");
				Integer suma=sc.nextInt();
				conc.aumentarKilometraje(mat2, suma);
				break;
			case 3:
				Arrays.sort(conc.concesionario);
				System.out.println(conc.toString());
				break;
			case 4:
				Comparator com=new CompararKm();
				Arrays.sort(conc.concesionario,com);
				System.out.println(conc.toString());
				break;
			case 5:
				System.out.println("Has salido");
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			}

		} while (op != 5);
	}

	public static void menu() {
		System.out.println("Elige una opcion:\n" + "1-Insertar datos coche\n" + "2-Aumentar Kilometraje\n"
				+ "3-Lista ordenada por color y luego matricula\n" + "4-Lista ordenada por kilometraje\n" + "5-Salir");

	}
}
