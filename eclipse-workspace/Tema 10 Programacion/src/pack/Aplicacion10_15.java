package pack;

import java.io.*;

public class Aplicacion10_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader in = new BufferedReader(new FileReader("numeros.txt"));
			String linea;
			int menor = 0;
			int mayor = 0;
			while ((linea = in.readLine()) != null) {
				int numero = Integer.parseInt(linea.trim());
				if (numero < menor) {
					menor = numero;
				}
				if (numero > mayor) {
					mayor = numero;
				}
			}
			in.close();
			System.out.println("El menor número es: " + menor);
			System.out.println("El mayor número es: " + mayor);

		} catch (IOException ex) {
			System.out.println("Ocurrió un error al leer el archivo.");
		}
	}
}
