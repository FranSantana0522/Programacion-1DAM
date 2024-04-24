package pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActividadResuelta10_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nombre del fichero ");
		String ficheroOriginal = new Scanner(System.in).nextLine();
		String ficheroCopia = "Copia_de_" + ficheroOriginal;
		try (BufferedReader in = new BufferedReader(new FileReader(ficheroOriginal));
			BufferedWriter out = new BufferedWriter(new FileWriter(ficheroCopia))) {
			int c = in.read();
			while (c != -1) {
				out.write(c);
				c = in.read();
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
