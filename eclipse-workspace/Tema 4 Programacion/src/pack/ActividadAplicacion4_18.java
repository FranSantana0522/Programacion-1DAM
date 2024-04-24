package pack;

import java.util.Scanner;

public class ActividadAplicacion4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Numeros que se mostraran: ");
		int n=sc.nextInt();
		System.out.println("El maximo numero posible: ");
		int max=sc.nextInt();
		System.out.println("El minimo numero posible: ");
		int min=sc.nextInt();
		mostarNumeros(n,max,min);
	}
	static void mostarNumeros(int n,int max, int min) {
		for(int i=1;i<=n;i++) {
			double mostar=Math.random()* (max-min)+min;
			System.out.println((int)mostar);
		}
	}

}
