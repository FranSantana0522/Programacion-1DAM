package pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Aplicacion11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] tabla = new String[0];
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("listanombre.dat"))) {
				tabla=(String[])in.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("listanombre.dat"))) {
			System.out.println("Introduce nombre:");
			String nombre1 = sc.next();
			while(!nombre1.equals("fin")) {
			tabla = Arrays.copyOf(tabla, tabla.length + 1);
			tabla[tabla.length - 1] = nombre1;
			out.writeObject(tabla);
			System.out.println(Arrays.toString(tabla));
			System.out.println("Introduce nombre:");
			nombre1 = sc.next();
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
