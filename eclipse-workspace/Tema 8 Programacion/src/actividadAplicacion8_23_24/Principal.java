package actividadAplicacion8_23_24;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Triangulo poligon=new Triangulo();
		System.out.println("Introduce altura: ");
		double alt=sc.nextDouble();
		poligon.setAltura(alt);
		System.out.println("Introduce base: ");
		double bas=sc.nextDouble();
		poligon.setBase(bas);
		System.out.println("Area:"+poligon.area());
		System.out.println(poligon.toString());
		Rectangulo rect=new Rectangulo();
		System.out.println("Introduce altura: ");
		double alt1=sc.nextDouble();
		rect.setAltura(alt1);
		System.out.println("Introduce base: ");
		double bas1=sc.nextDouble();
		rect.setBase(bas1);
		System.out.println("Area:"+rect.area());
		System.out.println(rect.toString());
	}

}
