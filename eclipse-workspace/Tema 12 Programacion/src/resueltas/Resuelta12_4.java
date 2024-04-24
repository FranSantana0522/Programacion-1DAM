package resueltas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Resuelta12_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> numeros = new ArrayList<>();
		System.out.println("Introducir entero: ");
		Integer n = new Scanner(System.in).nextInt();
		while (n >= 0) {
			numeros.add(n);
			System.out.println("Introducir entero: ");
			n = new Scanner(System.in).nextInt();
		}
		System.out.println("Lista completa: " + numeros);
		System.out.println("Pares: ");
		for (Integer a : numeros) {
			if (a % 2 == 0) {
				System.out.println(a + " ");
			}
		}
		System.out.println(" ");
		for (Iterator<Integer> it = numeros.iterator(); it.hasNext();) {
			n = it.next();
			if (n % 3 == 0) {
				it.remove();
			}
		}
		System.out.println("No multiplos de 3: " + numeros);
	}

}