package pack;

import java.util.Scanner;

public class ActividadPropuesta3_1 { // En verdad esto es ActividadPropuesta3_1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean esPar, esPositivo;
		System.out.print("Introduzca un numero:");
		int num =sc.nextInt();
		while (num !=0) {
			esPar = num%2==0? true:false;
			esPositivo=num>=0?true:false;
			System.out.println("Es par? " + esPar + " \nEs positivo: " + esPositivo);
			System.out.println("Cuadrado: " + num * num);
			System.out.print("Introduzca un numero: ");
			num=sc.nextInt();
			
			
		}
			
			
			
	}

}
