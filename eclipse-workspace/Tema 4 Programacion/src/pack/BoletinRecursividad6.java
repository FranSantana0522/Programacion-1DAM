package pack;

import java.util.Scanner;

public class BoletinRecursividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 1;
		do {
			System.out.println("Introduce un numero ");
			n = sc.nextInt();
		} while (n < 0);
		int div = 1;
		divisores(n, div);
	}

	static int divisores(int n, int div) {
		boolean flag = true;
		if (div > n / 2) {
			flag = false;
		} else if (n % div != 0) {
			divisores(n, div + 1);
		} else {
			System.out.println(div);
			divisores(n, div + 1);
		}
		return (div);
	}

}
