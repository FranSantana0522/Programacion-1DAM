package pack;

import java.util.Scanner;

public class ActividadAmpliacion3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int dinero;
		int suma=0;
		do {
			System.out.println("Introduce una cantidad de dinero: ");
			dinero=sc.nextInt();
			suma+=dinero;
		}while(dinero!=0);
		System.out.println("La cantidad de dinero ingresada es: " + suma);
	}

}
