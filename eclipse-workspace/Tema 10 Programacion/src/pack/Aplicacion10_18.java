package pack;

import java.io.*;
import java.util.Arrays;

public class Aplicacion10_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String archivo = "enteros.txt";
		Integer[] resultado = leerEnteros(archivo);
		System.out.println(Arrays.toString(resultado));
	}

	public static Integer[] leerEnteros(String texto) {
		Integer[] resultado = new Integer[0];
		BufferedReader in = null;
		try {

			in = new BufferedReader(new FileReader(texto));
			String lineas = in.readLine();
			while (lineas != null) {
				String[] palabras = lineas.split("");
				for (int i = 0; i < palabras.length; i++) {
					try {
						int enteros = Integer.valueOf(palabras[i]);
						resultado = Arrays.copyOf(resultado, resultado.length + 1);
						resultado[resultado.length - 1] = enteros;
					} catch (NumberFormatException ex) {
						System.out.println(ex.getMessage());
					}
				}
				lineas = in.readLine();
			}

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		return resultado;
	}
}
