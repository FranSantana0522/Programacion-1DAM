package pack;

import java.util.Scanner;

public class ActividadBaseExponente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base, exponente;
		int resultado=1;
		do {
		System.out.println("Escriba una base: ");
		base=sc.nextInt();
		}while(base<=0);
		do {
		System.out.println("Escriba un exponente: ");
		for(exponente=sc.nextInt();exponente!=0;exponente--) {
					resultado=resultado*base;
				
			}
		}while (exponente<0);
		System.out.println("Resultado: " + resultado);
	
	}

}
