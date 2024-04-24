package figuras;

import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {

	public static void main(String[] args) {
		int opcion;
		Scanner teclado = new Scanner(System.in);
		do {
			opcion = mostrarMenú();
			if (opcion != 4) {
				System.out.print("Introduzca la coordenada x del centro: ");
				double x = teclado.nextDouble();
				System.out.print("Introduzca la coordenada y del centro: ");
				double y = teclado.nextDouble();
				switch (opcion) {
				case 1:
					System.out.print("Introduzca el lado 1 del triangulo: ");
					double lado1 = teclado.nextDouble();
					System.out.print("Introduzca el lado 2 del triangulo: ");
					double lado2 = teclado.nextDouble();
					System.out.print("Introduzca el lado 3 del triangulo: ");
					double lado3 = teclado.nextDouble();
					Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);
					System.out.println("El perimetro es " + t.perimetro());
					System.out.println("El area es " + t.area());
					break;
				case 2:
					System.out.print("Introduzca la base del rectangulo: ");
					double base = teclado.nextDouble();
					System.out.print("Introduzca la altura del rectangulo: ");
					double altura = teclado.nextDouble();
					Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
					System.out.println("El perimetro es " + r.perimetro());
					System.out.println("El area es " + r.area());
					break;
				case 3:
					System.out.print("Introduzca el lado del cuadrado: ");
					double lado = teclado.nextDouble();
					Cuadrado c = new Cuadrado(x, y, Color.red, lado);
					System.out.println("El perimetro es " + c.perimetro());
					System.out.println("El area es " + c.area());
					break;
				}
			}
		} while (opcion != 4);
		teclado.close();
	}

	public static int mostrarMenú() {
		int opción;
		System.out.println("1) Triangulo");
		System.out.println("2) Rectangulo");
		System.out.println("3) Cuadrado");
		System.out.println("4) Salir");
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Introduzca una opcion (1-4): ");
			opción = teclado.nextInt();
			if (opción < 1 || opción > 4)
				System.out.println("Debe introducir un numero entre 1 y 4");
		} while (opción < 1 || opción > 4);
		return opción;
	}
}
