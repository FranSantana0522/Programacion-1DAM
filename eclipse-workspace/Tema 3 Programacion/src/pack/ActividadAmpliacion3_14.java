package pack;

import java.util.Scanner;

public class ActividadAmpliacion3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner numeroTeclado = new Scanner(System.in);
		
		int numero=0;
		boolean primo = true;
		int cantidadDePrimos=0;
		
		System.out.println("Introduce un numero: ");
		numero = numeroTeclado.nextInt();
		
		for(int i=numero; i>0; i--) {
			
			for( int j = i-1; j>1; j--) {
				
				if((i % j) == 0) {
					primo=false;
					break;
				}
			}
			
			if(primo) {
				System.out.println("El numero "+i);
				cantidadDePrimos++;
			}
			primo=true;
		}
		
		System.out.println("Hay "+cantidadDePrimos + " numeros primos");
	}
	
}
