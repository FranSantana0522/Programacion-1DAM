package pack;

import java.util.Scanner;

public class Actividad1_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a, b, c, x, x2, y;
		System.out.println("Escriba a: ");
		a=sc.nextInt();
		System.out.println("Escriba b: ");
		b=sc.nextInt();
		System.out.println("Escriba c: ");
		c=sc.nextInt();
		System.out.println("Escriba x: ");
		x=sc.nextInt();
		x2=x*x;
		y=a*x2+b*x+c ;
		System.out.println("El valor de y " +y);
		
		
	}

}
