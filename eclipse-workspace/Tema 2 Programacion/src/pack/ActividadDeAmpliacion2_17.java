package pack;

import java.util.Scanner;

public class ActividadDeAmpliacion2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1;
		int n2;
		int suma;
		int sumaManual;
		n1=(int) (Math.random()*100);
		System.out.println("El primer numero aleatorio es: " +n1);
		n2=(int) (Math.random()*100);
		System.out.println("El segundo numero aleatorio es: " +n2);
		suma=n1+n2;
		System.out.println("La suma es:");
		sumaManual=sc.nextInt();
		if (sumaManual==suma) {
			System.out.println("La suma es correcta");
		}else {
			System.out.println("La suma es incorrecta");
		}
		
		
		
		
	}

}
