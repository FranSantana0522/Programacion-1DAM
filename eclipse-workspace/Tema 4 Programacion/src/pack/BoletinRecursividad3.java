package pack;

import java.util.Scanner;

public class BoletinRecursividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int n = sc.nextInt();
		int m = 1;
		System.out.println(tabla(n, m));

	}

	static int tabla(int n, int m) {
		int resultado;
		if (m == 10) {
			resultado = n * m;
		} else {
			resultado = tabla(n, m + 1);
		}
		return (resultado);
	}
}
