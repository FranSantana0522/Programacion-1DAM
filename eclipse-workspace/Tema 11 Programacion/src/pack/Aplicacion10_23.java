package pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Aplicacion10_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tabla1 = { 1, 3, 5, 7, 9 };
		Integer[] tabla2 = { 2, 4, 6, 8, 10 };
		Integer[] tabla3 = new Integer[10];
		String fich1 = "fichero1.dat";
		String fich2 = "fichero2.dat";
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("fichero1.dat"));
				ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("fichero2.dat"))) {
			out.writeObject(tabla1);
			out2.writeObject(tabla2);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		tabla3 = fusionar(fich1, fich2);
		System.out.println(Arrays.toString(tabla3));
	}

	public static Integer[] fusionar(String fichero1, String fichero2) {
		Integer[] tabla1 = new Integer[5];
		Integer[] tabla2 = new Integer[5];
		Integer[] fusion = new Integer[10];
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fichero1));
				ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(fichero2))) {
			tabla1 = (Integer[]) in.readObject();
			tabla2 = (Integer[]) in2.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < tabla1.length && j < tabla2.length) {
			if (tabla1[i] < tabla2[j]) {
				fusion[k] = tabla1[i];
				i++;
			} else {
				fusion[k] = tabla2[j];
				j++;
			}
			k++;
		}
		while (i < tabla1.length) {
			fusion[k] = tabla1[i];
			i++;
			k++;
		}
		while (j < tabla2.length) {
			fusion[k] = tabla2[j];
			j++;
			k++;
		}
		return fusion;
	}
}
