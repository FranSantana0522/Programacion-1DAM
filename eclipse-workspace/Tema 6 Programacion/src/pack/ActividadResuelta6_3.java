package pack;

import java.util.Scanner;

public class ActividadResuelta6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String passwd,palabra;
		System.out.println("Jugador 1. Introduzca la contaseña: ");
		passwd=sc.nextLine();
		do {
			System.out.println("Jugador 2. Palabra: ");
			palabra=sc.nextLine();
			int comparacion= passwd.compareTo(palabra);
			if(comparacion==0) {
				System.out.println("¡Acertaste!");
			}else if(comparacion>0) {
				System.out.println("La contraseña es menor que: "+palabra);
			}else {
				System.out.println("La contraseña es mayor que: "+palabra);
			}
		}while(!passwd.equals(palabra));
		sc.close();
	}

}
