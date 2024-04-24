package pack;

import java.util.Scanner;

public class BoletinMoodle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] tab = new int[15];

		for (int i = 0; i < 15; i++) {
			System.out.println("Introduzca 15 numeros: ");
			tab[i] = sc.nextInt();
		}
		int guardado = tab[14];
		System.out.println(" ");
		for (int i = 13; i > 1; i--) {
			tab[i + 1] = tab[i];

		}
		tab[0] = guardado;
		for (int i = 0; i < 15; i++) {
			System.out.println(tab[i]);
		}

	}

}
