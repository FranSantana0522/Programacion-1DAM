package pack;

import java.util.Scanner;

public class Actividad1_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		int m;
		int multiplo;
		int suma;
		System.out.println("Indica n: ");
		n=sc.nextInt();
		System.out.println("Indica el numero que quieres que sea multiplo: ");
		m=sc.nextInt();
		multiplo=n % m;
		suma=multiplo-m;
		System.out.println("Para que sea multiplo de " +m+ " tiene que restar "+suma);
		
		
		
		
	}

}