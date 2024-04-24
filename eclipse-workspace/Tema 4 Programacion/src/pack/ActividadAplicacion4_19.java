package pack;

import java.util.Scanner;

public class ActividadAplicacion4_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Numeros que se mostraran: ");
		int n=sc.nextInt();
		mostarNumeros(n);
	}
	static void mostarNumeros(int n) {
		for(int i=1;i<=n;i++) {
			double mostar=Math.random();
			System.out.println(mostar);
		}
	}


}
