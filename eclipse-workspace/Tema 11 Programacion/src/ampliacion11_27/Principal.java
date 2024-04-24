package ampliacion11_27;

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
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("deportes.dat"))) {
			tabla = (Lista) in.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		do {
			verMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				
				break;
			case 2:
			
				break;
			case 3:
		
				break;
			case 4: 
				
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("Has salido");
				try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("deportes.dat"))) {
					out.writeObject(tabla);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			default:
				System.out.println("Elige opcion correcta");
				break;
			}
		} while (opcion != 6);
	}

	public static void verMenu() {
		System.out.println("1-Nuevo registro" + "\n2-Mostrar historial" + "\n3-Mostrar estadisticas" + "\n4-Salir");
	}

}
