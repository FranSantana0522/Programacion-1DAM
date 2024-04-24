package allString;

import java.util.Scanner;
import java.util.*;
public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fras="mata la saca paraca";
		System.out.println(fras.replace("a", "e"));
		
		System.out.println("Escriba una frase:");
		String frase=new Scanner(System.in).nextLine();
		System.out.println("¿Que caracter desea intercambiar?");
		char a=new Scanner(System.in).next().charAt(0);
		System.out.println("Indica caracter para cambiar: ");
		char b=new Scanner(System.in).next().charAt(0);
		System.out.println(frase.replace(a, b));
	}

}
