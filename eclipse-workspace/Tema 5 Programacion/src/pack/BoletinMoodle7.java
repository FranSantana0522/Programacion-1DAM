package pack;

import java.util.Scanner;

public class BoletinMoodle7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] v = new int[8];
		for (int i = 0; i < 8; i++) {
			System.out.println("Introduce un numero: ");
			v[i] = sc.nextInt();
		}
		for (int i = 0; i < 8; i++) {
			if (v[i] % 2 == 0) {
				System.out.println(v[i] + " es par");
			} else {
				System.out.println(v[i] + " es impar");
			}
		}
	}

}
