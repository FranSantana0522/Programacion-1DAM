package pack;

import java.util.Scanner;

public class Actividad2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int numero2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero:");
		numero=sc.nextInt();
		System.out.println("Introduce otro numero:");
		numero2=sc.nextInt();
		if (numero > numero2) {
			System.out.println("Es mayor " + numero + " que el " + numero2);
			} else {
				System.out.println("Es mayor " + numero2 + " que el " + numero);
			}
				
			
		
	}

}
