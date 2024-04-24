package pack;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Aplicacion11_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("apli17.dat"))) {
			System.out.println("Introduce linea:");
			String linea = sc.nextLine();
			while (!linea.equals("")) {
				out.writeObject(linea);
				System.out.println("Introduce linea:");
				linea = sc.nextLine();
			}
			out.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("apli17.dat"))) {
			String archivo = "";
			while (true) {
				archivo = (String) in.readObject();
				System.out.println(archivo);
			}
		} catch (EOFException ex) {
			System.out.println("Fin de fichero");
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());

		}

	}
}
