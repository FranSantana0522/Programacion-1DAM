package pack;

import java.util.Scanner;

public class ActividadResuelta3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int edad;
		int max;
		int min;
		System.out.println("Introduzca una edad:");
		edad=sc.nextInt();
		max=edad;
		min=edad;
		while (edad!=-1) {
			System.out.println(edad);
			if (edad>max) {
				max=edad;
			} else if (edad<min) {
				min=edad;
			}
		System.out.println("Introduzca una edad:");
		edad=sc.nextInt();
		
		}
		System.out.println("El maximo es:" + max);
		System.out.println("El minimo es:" + min);
		
		
	}

}
