package pack;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Resuelta11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("datos.dat"))){
			System.out.println("Numero de elementos");
			int n= new Scanner(System.in).nextInt();
			double tabla[]=new double[n];
			for(int i=0;i<tabla.length;i++) {
				System.out.println("Introduzca un numero real: ");
				tabla[i]=new Scanner(System.in).useLocale(Locale.US).nextDouble();
			}
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
