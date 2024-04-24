package pack;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacion10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce fichero: ");
		String nombre = sc.nextLine();
		String texto="";
		if (nombre.equals("")) {
			nombre="prueba.txt";
		}
		try {
			FileReader in = new FileReader(nombre);
			int c = in.read();
			while (c != -1) {
				texto=texto+(char)c;
				c = in.read();
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(texto);
		
	}

}
