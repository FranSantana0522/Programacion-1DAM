package pack;

import java.util.Scanner;

public class ActividadesAplicacion6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase;
		System.out.println("Escribe una frase con comentarios (/*.....*/)");
		frase = sc.nextLine();
		System.out.println(frase.substring(0,frase.indexOf("/*"))+frase.substring(frase.indexOf("*/")+2));
		sc.close();
	}

}
