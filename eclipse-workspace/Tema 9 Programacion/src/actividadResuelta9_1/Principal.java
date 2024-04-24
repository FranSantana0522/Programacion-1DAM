package actividadResuelta9_1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista c = new Lista();
		System.out.println("Introducir un numero: ");
		Integer n = new Scanner(System.in).nextInt();
		while (n >= 0) {
			c.encolar(n);
			System.out.println("Introducir numero: ");
			n = new Scanner(System.in).nextInt();
		}
		n = c.desencolar();
		while (n != null) {
			System.out.println(n + " ");
			n = c.desencolar();
		}
		System.out.println("");

		Lista d = new Lista();
		System.out.println("Introduce un numero: ");
		Integer n2 = new Scanner(System.in).nextInt();
		while (n2 >= 0) {
			d.apilar(n2);
			System.out.println("Introducir numero: ");
			n2 = new Scanner(System.in).nextInt();
		}
		n2 = d.desapilar();
		while (n2 != null) {
			System.out.println(n2 + " ");
			n2 = d.desapilar();
		}
		System.out.println("");

		Lista e = new Lista();
		System.out.println("Introduce un numero: ");
		Integer n3 = new Scanner(System.in).nextInt();
		while (n3 >= 0) {
			e.encolarCabeza(n3);
			System.out.println("Introducir numero: ");
			n3 = new Scanner(System.in).nextInt();
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
			public void encolar(Integer nuevo) {
				// TODO Auto-generated method stub
				l.insertarFinal(nuevo);
			}

			@Override
			public Integer desencolar() {
				// TODO Auto-generated method stub
				return l.eliminar(0);
			}
			
		};
		System.out.println("Introducir numeros (negativos para salir): ");
		Integer n4=new Scanner(System.in).nextInt();
		while(n4>=0) {
			cola.encolar(n4);
			System.out.println("Introducir numeros: ");
			n4=new Scanner(System.in).nextInt();
		}
		n4=cola.desencolar();
		while(n4!=null) {
			System.out.println(n4+ " ");
			n4=cola.desencolar();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
