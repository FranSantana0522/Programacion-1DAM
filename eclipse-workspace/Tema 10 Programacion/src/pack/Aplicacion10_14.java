package pack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aplicacion10_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroC = 0;
		int numeroL = 0;
		int numeroP = 0;
		try (BufferedReader in = new BufferedReader(new FileReader("carta.txt"))) {
			String linea;
			while ((linea =in.readLine()) != null) {
				numeroL++;
				numeroC += linea.length();
				String[] palabras = linea.split(" ");
				numeroP += palabras.length;
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println("Número de caracteres: " + numeroC);
		System.out.println("Número de líneas: " + numeroL);
		System.out.println("Número de palabras: " + numeroP);
	}

}