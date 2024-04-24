package pack;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadesAplicacion6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion = 1;
		String nombre = "";
		String tfno = "";
		int pos = 0;
		String[] agenda = new String[0];
		// SEPARAR UN STRING -->SUBSTRING
		do {
			System.out.println("Elige una opcion:\n1.Añadir\n2.Buscar\n3.Listar\n4.Salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				String saltoLinea = sc.nextLine();// MUY IMP
				System.out.println("Dime el nombre del nuevo contacto:");
				nombre = sc.nextLine();
				System.out.println("Dime su telefono:");
				tfno = sc.nextLine();
				String contacto = nombre + ":" + tfno;
				// System.out.println(contacto);
				// aumentamos el tamaño de la agenda
				agenda = Arrays.copyOf(agenda, agenda.length + 1);
				// la introducimos en la primera posicion libre
				agenda[pos] = contacto;
				System.out.println("Contacto añadido.");
				pos++;
				break;

			case 2:
				String saltoLinea2 = sc.nextLine();
				System.out.println("Dime el nombre del contacto:");
				String buscado = sc.nextLine();
				boolean encontrado = true;
				for (int i = 0; i < agenda.length; i++) {
					// IMP ESTE METODO
					if (buscado.startsWith(agenda[i])) {
						encontrado = true;
					}
				}
				if (encontrado == true) {
					System.out.println("Telefono encontrado");
					System.out.println(tfno);
				} else if (encontrado == false) {
					System.out.println("No se ha encontrado el telefono");
				}
				break;

			case 3:
				System.out.println("LISTA DE CONTACTOS");
				for (int i = 0; i < agenda.length; i++) {
					System.out.println(agenda[i]);
				}
				break;
			}
		} while (opcion != 4);
		sc.close();
	}
}
