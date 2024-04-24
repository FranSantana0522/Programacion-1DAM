package packCoches;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String matricula, color;
		// IMP-->CREAMOS OBJETOS DE LAS 2 CLASES
		Coche coche;
		Garaje conc = new Garaje();
		int opcion;
		do {
			System.out.println("MENU");
			System.out.println(
					"1.Insertar coche\n2.Modificar color\n3.Eliminar coche\n4.Listado completo\n5.Consultar numero de coches\n6.Salir");
			System.out.print("Dime una opcion:");
			opcion = teclado.nextInt();
			switch (opcion) {// IMP-->COMO METER POR TECLADO MATRICULA Y COLOR Y AÑADIRLO AL OBJETO COCHE
			case 1:
				System.out.println("Dime la matricula:");
				matricula = teclado.next();
				System.out.println("Dime su color:");
				color = teclado.next();
				coche = new Coche(matricula, color);
				// IMP-->AÑADIMOS EN EL OBJETO DEL CONCESIONARIO EL ADDCOCHE
				conc.addCoche(coche);
				break;
			case 2:
				System.out.println("Dime la matricula:");
				matricula = teclado.next();
				System.out.println("Dime el nuevo color");
				color = teclado.next();
				conc.addColor(matricula, color);
				break;
			case 3:
				System.out.println("Dime la matricula:");
				matricula = teclado.next();
				conc.elimCoche(matricula);
				break;
			case 4:
				conc.listadoCompleto();
				break;
			case 5:
				System.out.println("Numero de coches:" + conc.numCoches());
			}
		} while (opcion != 6);
	}
}
