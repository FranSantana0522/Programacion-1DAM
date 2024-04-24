package pack;

import java.util.Scanner;

public class Actividad2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un numero entre el 0 y el 99.999: ");
		int num=sc.nextInt();
		if (num<10) {
			System.out.println("Tiene 1 cifra");
		} else if (num<100) {
			System.out.println("Tiene 2 cifras");
		} else if (num<1000) {
			System.out.println("Tiene 3 cifras");
		} else if (num<10000) {
			System.out.println("Tiene 4 cifras");
		} else if (num<100000) {
			System.out.println("Tiene 5 cifras");
		}
		
		
		
		
		

	}

}
