package actividadAplicacion9_15;

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
		n = c.desencolar();
		while (n != null) {
			System.out.println(n + " ");
			n = c.desencolar();
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
		n2 = d.desapilar();
		while (n2 != null) {
			System.out.println(n2 + " ");
			n2 = d.desapilar();
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
			public void encolar(String nuevo) {
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
		n4=cola.desencolar();
		while(n4!=null) {
			System.out.println(n4+ " ");
			n4=cola.desencolar();
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la capacidad de las colas: ");
        int capacidad = sc.nextInt();
        Supercola supercola = new Supercola(capacidad);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\nMenú:");
            System.out.println("1. Encolar en cola1");
            System.out.println("2. Encolar en cola2");
            System.out.println("3. Desencolar de cola1");
            System.out.println("4. Desencolar de cola2");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un elemento para encolar en cola 1: ");
                    int elemento1 = sc.nextInt();
                    supercola.encolarEnCola1(elemento1);
                    break;
                case 2:
                    System.out.print("Ingrese un elemento para encolar en cola 2: ");
                    int elemento2 = sc.nextInt();
                    supercola.encolarEnCola2(elemento2);
                    break;
                case 3:
                    Integer desencolado1 = supercola.desencolarDeCola1();
                    if (desencolado1 != null) {
                        System.out.println("\nElemento desencolado de cola 1: " + desencolado1);
                    } else {
                        System.out.println("\nNo hay elementos para desencolar de cola 1");
                    }
                    break;
                case 4:
                    Integer desencolado2 = supercola.desencolarDeCola2();
                    if (desencolado2 != null) {
                        System.out.println("\nElemento desencolado de cola 2: " + desencolado2);
                    } else {
                        System.out.println("\nNo hay elementos para desencolar de cola 2");
                    }
                    break;
                case 5:
                    System.out.println("Saliste");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
			
		
		
	}

}
