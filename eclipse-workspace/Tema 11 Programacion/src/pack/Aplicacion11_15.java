package pack;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Aplicacion11_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros.dat"));
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Pares.dat"));
				ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("Impares.dat"))) {
			int[] tabla = new int[10];
			int[] tablaP = new int[10];
			int[] tablaI = new int[10];
			for (int i = 0; i < tabla.length; i++) {
				int numero = in.readInt();
				tabla[i] = numero;
				System.out.println(numero + " ");
				if (tabla[i] % 2 == 0) {
					tablaP[i] = tabla[i];
					out.writeInt(numero);
					System.out.println("Tabla Par"+Arrays.toString(tablaP));
				} else {
					tablaI[i] = tabla[i];
					out2.writeInt(numero);
					System.out.println("Tabla Impar"+Arrays.toString(tablaI));
				}
			}
		} catch (EOFException ex) {
			System.out.println("]\nFin de fichero");
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
