package pack;

import java.util.Scanner;

public class ActividadResuelta6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String original;
		String intento;
		do {
			System.out.println("Jugador 1.Introduzca una palabra: ");
			original=sc.next();
		}while(original.isEmpty());
		String anagrama=crearAnagrama(original);
		System.out.println("A que palabra correspondo el anagrama: \n"+anagrama);
		do {
			System.out.println("Jugador 2.¿Cual es el original? ");
			intento=sc.next();
		}while(original.equals(intento));
		System.out.println("Muy bien...");
		sc.close();
	}
	public static String crearAnagrama(String original) {
		char anagrama[]=original.toCharArray();
		for(int i=0;i<anagrama.length;i++) {
			int j=(int)(Math.random()*anagrama.length);
			int k=(int)(Math.random()*anagrama.length);
			char aux=anagrama[j];
			anagrama[j]=anagrama[k];
			anagrama[k]=aux;
		}
		return String.valueOf(anagrama);
	}
}
