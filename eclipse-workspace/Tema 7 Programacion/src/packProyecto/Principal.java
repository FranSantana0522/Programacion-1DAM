package packProyecto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int op;
		Asociacion asociacion=new Asociacion();
		Socio socio;
		do {

			vermenu();
			op = sc.nextInt();
			switch (op) {

			case 1:
				asociacion.alta();
				break;

			case 2:
				System.out.println("Introduce codigo: ");
				int codigo=sc.nextInt();
				socio=new Socio(codigo);
				asociacion.modificarFecha(socio);
				break;

			case 3:
				asociacion.listadoCompleto();
				break;

			case 4:
				asociacion.listOrdNombre();
				break;

			case 5:
				asociacion.listOrdFecha();
				break;
			case 6:
				System.out.println("Has salido");
				break;
				
			default:
				System.out.println("Introduce una opcion correcta");
				break;
			}

		} while (op != 6);
	}

	public static void vermenu() {
		System.out.println("Elige un opcion: " + "\n1-Alta de socio" + "\n2-Modificacion de fecha"
				+ "\n3-Listado completo" + "\n4-Listado ordenado por nombre"
				+ "\n5-Listado ordenado por fecha nacimiento" + "\n6-Salir");
	}
}
