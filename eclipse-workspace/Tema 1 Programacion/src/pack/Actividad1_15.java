package pack;

import java.util.Scanner;

public class Actividad1_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double iva;
		double baseImponible;
		double total;
		double ivaImponible;
		Scanner sc=new Scanner(System.in);
		System.out.println("Base imponible a pagar: ");
		baseImponible=sc.nextInt();
		System.out.println("Escriba el iva: ");
		iva=sc.nextInt();
		ivaImponible=iva*baseImponible / 100;
		System.out.println("El iva a pagar es: " + ivaImponible + " euros");
		total=ivaImponible + baseImponible;
		System.out.println("El precio total es de: " + total + " euros");
		
		
	}

}
