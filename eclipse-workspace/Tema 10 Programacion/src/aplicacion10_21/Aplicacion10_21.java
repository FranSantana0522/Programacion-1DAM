package aplicacion10_21;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Aplicacion10_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion;
		Agenda agenda = new Agenda();
		Contactos contacts;
		BufferedWriter out = null;
		BufferedReader in = null;
		String linea;
		try {
			in = new BufferedReader(new FileReader("Agenda.txt"));
			while ((linea = in.readLine()) != null) {
				String[] aux = new String[2];
				aux = linea.split(",");
				Contactos a = new Contactos(aux[0], Integer.parseInt(aux[1]));
				agenda.insertarFinal(a);
			}
			in.close();
			do {
				menu();
				opcion = sc.nextInt();

				switch (opcion) {
				case 1:

					System.out.println("Introduce tu nombre: ");
					String nom = sc.next();
					System.out.println("Introduce tu telefono: ");
					Integer tlf = sc.nextInt();
					if (agenda.buscar(nom) == -1) {
						Contactos a2 = new Contactos(nom, tlf);
						agenda.insertarFinal(a2);
					} else {
						System.out.println("Ya existe ese nombre.");
					}
					break;
				case 2:
					System.out.println("Nombre que buscas:");
					String n=sc.next();
					agenda.busqueda(n);
					break;
				case 3:
					Arrays.sort(agenda.agenda);
					System.out.println(agenda.toString());
					break;
				case 4:
					try {
						out = new BufferedWriter(new FileWriter("Agenda.txt"));
						for (int i = 0; i < agenda.agenda.length; i++) {
							out.write(agenda.getNombre(i) + "," + agenda.getTelefono(i) + "\n");
						}
						out.close();
					} catch (IOException ex) {
						System.out.println(ex.getMessage());
					}
					System.out.println("Has salido");
					break;
				default:
					System.out.println("Opcion incorrecta");
					break;
				}
			} while (opcion != 4);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void menu() {
		System.out.println("Elige una opcion:\n" + "1-Nuevo contacto\n" + "2-Buscar por nombre\n" + "3-Mostrar todos\n"
				+ "4-Salir\n");
	}
}
