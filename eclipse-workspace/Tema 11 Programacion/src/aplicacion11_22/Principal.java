package aplicacion11_22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion;
		Lista tabla = new Lista();
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("Empleados.dat"))) {
			tabla=(Lista)in.readObject();
		}catch(IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		do {
			verMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce DNI: ");
				String dni=sc.next();
				System.out.println("Introduce nombre: ");
				String nom=sc.next();
				System.out.println("Introduce numero sueldo: ");
				Integer tlf=sc.nextInt();
				Empleado emple=new Empleado(dni,nom,tlf);
				tabla.insertarFinal(emple);
				break;
			case 2:
				System.out.println("Introduce DNI del empleado a eliminar: ");
				String id=sc.next();
				Integer pos2=tabla.buscar(id);
				if(pos2!=-1) {
					tabla.eliminar(id);
				}else {
					System.out.println("No se encontro");
				}
				break;
			case 3:
				System.out.println("Introduce DNI del empleado a mostrar: ");
				String dni2=sc.next();
				Integer pos3=tabla.buscar(dni2);
				if(pos3!=-1) {
					System.out.println(tabla.tabla[pos3]);
				}else {
					System.out.println("No se encontro");
				}
				break;
				
			case 4:
				System.out.println(Arrays.toString(tabla.tabla));
				break;

			case 5:
				System.out.println("Has salido");
				try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Empleados.dat"))){
					out.writeObject(tabla);
				}catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			default:
				System.out.println("Elige opcion correcta");
				break;
			}
		} while (opcion != 5);
	}

	public static void verMenu() {
		System.out.println("1-Alta empleado" + "\n2-Baja empleado" + "\n3-Mostrar datos empleado"
				+ "\n4-Listar empleados" + "\n5-Salir");
	}

}
