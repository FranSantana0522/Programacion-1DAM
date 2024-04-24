package packEjPALumnos;

import java.util.Scanner;

public class ActividadPropuestaProfesora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase clase=new Clase();
		Alumno alumno;
		Scanner sc=new Scanner(System.in);
		int op;
		do {
			verMenu();
			op=sc.nextInt();
			
			switch (op) {
				case 1:
					clase.introducirAlumno();
				break;
				
				case 2:
					System.out.println("Introduce nombre: ");
					String buscar=sc.next();
					alumno=new Alumno(buscar);
					clase.introducirNotas(alumno);
				break;
				
				case 3:
					clase.listOrdNombre();
				break;
				
				case 4:
					clase.listOrdNotas();
				break;
				
				case 5:
					clase.listOrdAsignatura2();
				break;
				
				case 6:
					clase.listCompleto();
				break;
				
				case 7:
					System.out.println("Has salido");
				break;
				
				default:
					System.out.println("Elige una opcion correcta");
			}
		}while(op!=7);
	}
	public static void verMenu() {
		System.out.println("Elige una opcion: "
				+ "\n1-Insertar Alumno "
				+ "\n2-Añadir Notas "
				+ "\n3-Listado Ord Alfabeticamente "
				+ "\n4-Listado Ord Nota Media "
				+ "\n5-Listado Alumnos Notas asignatura 2 "
				+ "\n6-Listado Completo "
				+ "\n7-Salir");
	}
}
