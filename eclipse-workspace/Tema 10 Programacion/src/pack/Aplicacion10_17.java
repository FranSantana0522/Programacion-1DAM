package pack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacion10_17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String archivo = "Quijote.txt";
		try (BufferedReader in = new BufferedReader(new FileReader(archivo))) {
			String linea;
			int cont = 0;
			while ((linea = in.readLine()) != null) {
				System.out.println(linea);
				cont++;
				if (cont == 24) {
					String enter=sc.nextLine();
					cont=0;
				}
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
