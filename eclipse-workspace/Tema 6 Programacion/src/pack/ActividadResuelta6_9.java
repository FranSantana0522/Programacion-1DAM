package pack;

import java.util.Scanner;

public class ActividadResuelta6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String frase="", palabra;
		System.out.println("Escribe una palabra: ");
		palabra=sc.next();
		while(!palabra.toLowerCase().equals("fin")) {
			frase=frase+" "+palabra;
			System.out.println("Escribe una palabra: ");
			palabra=sc.next();
		}
		System.out.println(frase);
		sc.close();
	}

}
