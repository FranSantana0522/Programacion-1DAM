package pack;

import java.util.Scanner;

public class ActividadResuelta3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		double factorial;
		int num;
		System.out.print("Introduzca un numero: ");
		num=sc.nextInt();
		factorial=1;
		for(int i=num; i>0;i--) {
			factorial=factorial*i;
			
		}
		System.out.println("El factorial de " + num + " es: " +factorial);
	}

}
