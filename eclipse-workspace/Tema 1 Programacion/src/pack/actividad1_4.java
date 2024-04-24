package pack;

import java.util.Scanner;

public class actividad1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int añoactual;
			int añonacimiento;
			int edad;
			Scanner sc = new Scanner(System.in);
			System.out.println("Escriba año actual: ");
			añoactual=sc.nextInt();
			System.out.println("Escriba año de nacimiento: ");
			añonacimiento=sc.nextInt();
			edad= añoactual-añonacimiento;
			System.out.println("Su edad es " + edad );
			
			
	}

}
