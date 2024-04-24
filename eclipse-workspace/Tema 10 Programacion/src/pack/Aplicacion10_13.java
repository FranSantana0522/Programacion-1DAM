package pack;

import java.io.*;
import java.util.Arrays;

public class Aplicacion10_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader in = new BufferedReader(new FileReader("lista1.txt"));
			BufferedReader in2 = new BufferedReader(new FileReader("lista2.txt"));
			String linea;
			int[] lista1 = new int[0];
			int[] lista2 = new int[0];
			int numero;
			while ((linea = in.readLine()) != null) {
				lista1=Arrays.copyOf(lista1, lista1.length+1);
				numero = Integer.valueOf(linea);
				lista1[lista1.length-1] = numero;
			}
			while ((linea = in2.readLine()) != null) {
				lista2=Arrays.copyOf(lista2, lista2.length+1);
				numero = Integer.valueOf(linea);
				lista2[lista2.length-1] = numero;
			}		
			int[] listaFusionada = new int[lista1.length+ lista2.length];
			System.arraycopy(lista1, 0, listaFusionada, 0, lista1.length);
			System.arraycopy(lista2, 0, listaFusionada, lista1.length, lista2.length);
			Arrays.sort(listaFusionada);
			System.out.println(Arrays.toString(listaFusionada));
			BufferedWriter out = new BufferedWriter(new FileWriter("listaOrdenada.txt"));
			for (int numeroOrdenado : listaFusionada) {
				out.write(numeroOrdenado+" ");
				out.newLine();
			}

			System.out.println("Las listas se han fusionado y ordenado correctamente en el archivo ");

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
