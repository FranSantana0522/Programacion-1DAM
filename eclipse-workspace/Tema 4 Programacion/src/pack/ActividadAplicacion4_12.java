package pack;

import java.util.Scanner;

public class ActividadAplicacion4_12 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la distancia 1 x: ");
		double x1=sc.nextDouble();
		System.out.println("Introduce la distancia 1 y: ");
		double y1=sc.nextDouble();
		System.out.println("Introduce la distancia 2 x: ");
		double x2=sc.nextDouble();
		System.out.println("Introduce la distancia 2 y: ");
		double y2=sc.nextDouble();
		double resultado=distancia(x1,y1,x2,y2);
		System.out.println(resultado);
	}
	static double distancia(double x1, double y1, double x2, double y2) {
		double distancia;
		distancia=Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
		return(distancia);
	}
}
