package futbol;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Jugador jug=new Jugador();
		Equipo equip=new Equipo();
		Liga lig=new Liga();
		int op;
		do {
			menu();
			op = sc.nextInt();
			switch (op) {
			case 1:
				lig.altaEquipo();
				break;
			case 2:
				int pos;
				System.out.println("Nombre del equipo al que pertenece: ");
				String nameE=sc.next();
				equip.setNombre(nameE);
				pos=lig.busqueda(equip);
				if(pos>-1) {
					lig.añadirJugadorE(pos, jug);
				}
				break;
			case 3:
				System.out.println(lig.toString());
				//lig.listadoCompLiga();
				break;
			case 4:
				lig.compOrdNombreEq();
				break;
			case 5:
				System.out.println("Nombre del equipo: ");
				String nameEq=sc.next();
				equip.setNombre(nameEq);
				pos=lig.busqueda(equip);
				if(pos>-1) {
					lig.modPresupuesto(pos);
				}
				break;
			case 6:
				lig.compOrdPresupuesto();
				break;
			case 7:
				System.out.println("Has salido");
				break;
			default:
				System.out.println("Elige una opcion correcta");
				break;
			}

		} while (op != 7);
	}

	public static void menu() {
		System.out
				.println("Elige una opcion:" + "\n1-Alta equipo" + "\n2-Alta jugador en equipo" + "\n3-Listado completo"
						+ "\n4-Listado completo orden alfabetico de equipo" + "\n5-Modificar presupuesto de equipo"
						+ "\n6-Listado completo orden ascendente presupuesto" + "\n7-Salir");
	}
}
