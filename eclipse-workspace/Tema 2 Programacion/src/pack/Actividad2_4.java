package pack;

import java.util.Locale;
import java.util.Scanner;

public class Actividad2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		sc.useLocale(Locale.US);
		System.out.print("Introduzca un numero real positivo o negativo: ");
		double num=sc.nextDouble();
		if ( -1 <num && num < 1 && num !=0) {
			System.out.println("Es un numero casi-cero");
		} else {
			System.out.println("No es un numero casi-cero");
		}
		
		
		
		
		
		
	}

}
