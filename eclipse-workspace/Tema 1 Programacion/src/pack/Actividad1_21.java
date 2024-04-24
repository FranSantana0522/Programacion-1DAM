package pack;

import java.util.Scanner;

public class Actividad1_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mm;
		double cm;
		double m;
		double cm2;
		double cm3;
		double cmfinal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una distancia en milimetros: ");
		mm=sc.nextDouble();
		System.out.println("Introduce una distancia en centimetros: ");
		cm=sc.nextDouble();
		System.out.println("Introduce una distancis en metros: ");
		m=sc.nextDouble();
		cm2=mm/10;
		cm3=m*100;
		cmfinal=cm+cm2+cm3;
		System.out.println("La suma de las medidas es: " + cmfinal + " centimetros");
		
		
		
		
		
	}

}
