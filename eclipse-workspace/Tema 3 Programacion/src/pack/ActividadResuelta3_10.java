package pack;

import java.util.Scanner;

public class ActividadResuelta3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double suma=0;
		for (int numero=1; numero<=10; numero++) {
			int impar = 2 * numero - 1;
			suma+=impar;
		}
		System.out.println("La suma de los 10 primeros impares es: " + suma);
	}

}
