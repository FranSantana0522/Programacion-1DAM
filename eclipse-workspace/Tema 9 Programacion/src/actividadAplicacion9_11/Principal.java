package actividadAplicacion9_11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista c = new Lista();
		System.out.println("Introducir una palabra (0 para salir): ");
		String n = new Scanner(System.in).next();
		while (!n.equals("0")) {
			c.encolar(n);
			System.out.println("Introducir palabra: ");
			n = new Scanner(System.in).next();
		}
		n = (String) c.desencolar();
		while (n != null) {
			System.out.println(n + " ");
			n = (String) c.desencolar();
		}
		System.out.println("");

		Lista d = new Lista();
		System.out.println("Introduce una palabra (0 para salir): ");
		String n2 = new Scanner(System.in).next();
		while (!n2.equals("0")) {
			d.apilar(n2);
			System.out.println("Introducir palabra: ");
			n2 = new Scanner(System.in).next();
		}
		n2 = (String) d.desapilar();
		while (n2 != null) {
			System.out.println(n2 + " ");
			n2 = (String) d.desapilar();
		}
		System.out.println("");

		Lista e = new Lista();
		System.out.println("Introduce una palabra (0 para salir): ");
		String n3 = new Scanner(System.in).next();
		while (!n3.equals("0")) {
			e.encolarCabeza(n3);
			System.out.println("Introducir palabra: ");
			n3 = new Scanner(System.in).next();
		}
		n3 = e.desencolarFinal();
		while (n3 != null) {
			System.out.println(n3 + " ");
			n3 = e.desencolarFinal();
		}
		System.out.println("");
		
		Cola cola=new Cola() {
			Lista l=new Lista();

			@Override
			public void encolar(Object nuevo) {
				// TODO Auto-generated method stub
				l.insertarFinal(nuevo);
			}

			@Override
			public String desencolar() {
				// TODO Auto-generated method stub
				return l.eliminar(0);
			}
			
		};
		System.out.println("Introducir palabra (0 para salir): ");
		String n4=new Scanner(System.in).next();
		while(!n4.equals("0")) {
			cola.encolar(n4);
			System.out.println("Introducir palabra: ");
			n4=new Scanner(System.in).next();
		}
		n4=(String) cola.desencolar();
		while(n4!=null) {
			System.out.println(n4+ " ");
			n4=(String) cola.desencolar();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
