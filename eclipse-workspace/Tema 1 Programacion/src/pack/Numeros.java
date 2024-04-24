package pack;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner(System.in);
		int numEntero;
		double numDouble;
		System.out.println("Introduce un entero:");
		numEntero=teclado.nextInt();
		System.out.println("Introduce un double:");
        numDouble = teclado.nextInt();
        System.out.println("El numero entero es " + numEntero);
        System.out.println("El numero double es " + numDouble);
        String cadena;
        System.out.println("Introduce un order de caracteres");
        cadena = teclado.nextLine();
        cadena = teclado.nextLine();
        System.out.println("La cadena es:" + cadena);
        
		
	}

}
