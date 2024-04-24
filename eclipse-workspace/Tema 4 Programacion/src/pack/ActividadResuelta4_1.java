package pack;

import java.util.Scanner;

public class ActividadResuelta4_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int n=sc.nextInt();
		System.out.println("--Antes de llamar a la funcion--");
		eco(n);
		System.out.println("--Despues de llamar a la funcion--");
			
	}
	static void eco(int a) {
		for(int i=0;i<a;i++) {
			System.out.println("Eco...");
		}
	}

}
