package pack;

import java.util.Scanner;

public class ActividadResuelta3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sumaEdades=0;
		int contadorAlumnos=0;
		int contadorMayorEdad=0;
		double media;
		System.out.println("Introduzca edad: ");
		int edad=sc.nextInt();
		while (edad>=0) {
			sumaEdades +=edad;
			contadorAlumnos++;
			
			if (edad>=18) {
				contadorMayorEdad++;
			}
			System.out.println("Introduzca edad: ");
			edad=sc.nextInt();
		}
		media = (double) sumaEdades/contadorAlumnos;		
		System.out.println("Suma de todas las edades: " + sumaEdades);
		System.out.println("Media: " + media);
		System.out.println("Numero total de alumnos: " + contadorAlumnos);
		System.out.println("Mayores de edad: " + contadorMayorEdad);
		
		
	}

}
