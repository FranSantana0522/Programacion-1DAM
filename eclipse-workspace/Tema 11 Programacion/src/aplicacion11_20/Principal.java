package aplicacion11_20;

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
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("Clientes.dat"))) {
			tabla=(Lista)in.readObject();
		}catch(IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		do {
			verMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce nombre: ");
				String nom=sc.next();
				System.out.println("Introduce numero telefono: ");
				Integer tlf=sc.nextInt();
				Clientes clien=new Clientes(nom,tlf);
				Integer id3=tabla.tabla.length+1;
				clien.setId(id3);
				tabla.insertarFinal(clien);
				break;
			case 2:
				System.out.println("Introduce id del cliente: ");
				Integer id2=sc.nextInt();
				Integer pos=tabla.buscar(id2);
				if(pos!=-1) {
					System.out.println("Introducir nuevo nombre: ");
					String nom2=sc.next();
					System.out.println("Introducir nuevo telefono: ");
					Integer tlf2=sc.nextInt();
					((Clientes)tabla.tabla[pos]).setNombre(nom2);
					((Clientes)tabla.tabla[pos]).setTlf(tlf2);
				}else {
					System.out.println("No se encontro el id");
				}
				break;
			case 3:
				System.out.println("Introduce id del cliente a eliminar: ");
				Integer id=sc.nextInt();
				Integer pos2=tabla.buscar(id);
				if(pos2!=-1) {
					tabla.eliminar(id);
				}else {
					System.out.println("No se encontro");
				}
				break;
				
			case 4:
				System.out.println(Arrays.toString(tabla.tabla));
				break;

			case 5:
				System.out.println("Has salido");
				try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Clientes.dat"))){
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
		System.out.println("1-Añadir nuevo cliente" + "\n2-Modificar Datos" + "\n3-Dar de baja cliente"
				+ "\n4-Listar clientes" + "\n5-Salir");
	}
}
