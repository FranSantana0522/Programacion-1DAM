package pack;

import java.util.Scanner;

public class BoletinRecursividad8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		vector(n2, 9);
		sc.close();
	}

	static void vector(int n2[], int n) {
		if (n >= 0) {
			System.out.println(n2[n]);
			vector(n2, n - 1);
		} else {
			System.out.println(" ");
		}
	}
}
