package pack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacion10_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa tu nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Ingresa tu edad: ");
		int edad = sc.nextInt();
		String datos = nombre + "," + edad;
		try {
			File archivo = new File("datos.txt");
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			FileWriter fileWriter = new FileWriter(archivo, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(datos);
			bufferedWriter.newLine(); 
			bufferedWriter.close();

			System.out.println("Los datos se han guardado en el archivo");
		} catch (IOException ex) {
			System.out.println("Error al guardar los datos en el archivo");
		}
	}
}
