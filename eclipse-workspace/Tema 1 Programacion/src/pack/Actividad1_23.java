package pack;

import java.util.Scanner;

public class Actividad1_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double importe;
		double entradasadultos;
		double entradasinfantil;
		double descuento;
		double importedescuento;
		double descuentofinal;
		Scanner sc= new Scanner(System.in);
		System.out.println("Cuantas entradas infantil desea comprar: ");
		entradasinfantil=sc.nextDouble();
		System.out.println("CUantas entradas adulto desea comprar: ");
		entradasadultos=sc.nextDouble();
		entradasinfantil=entradasinfantil*15.50;
		entradasadultos=entradasadultos*20;
		importe=entradasinfantil+entradasadultos;
		descuento=5*100;
		importedescuento=descuento/importe;
		descuentofinal=importe-importedescuento;
		System.out.println("El precio es de " + importe + " euros ");
		System.out.println("Si el precio supera los 100€ el precio sera de " + descuentofinal + " euros");
		
		
		
		
		
		
		
	}

}
