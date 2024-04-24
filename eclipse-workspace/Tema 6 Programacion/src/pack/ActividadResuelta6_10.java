package pack;

import java.util.Scanner;

public class ActividadResuelta6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String frase, sinEspacios, invertida;
		System.out.println("Introduzca una frase: ");
		frase=sc.nextLine();
		frase= frase.toLowerCase();
		sinEspacios=eliminaEspacios(frase);
		invertida=alReves(sinEspacios);
		if(sinEspacios.equals(invertida)) {
			System.out.println("La frase es palindroma");
		}else {
			System.out.println("la frase no es palindroma");
		}
		sc.close();
	}
	public static String eliminaEspacios(String cadena) {
		String sin="";
		for(int i=0;i<cadena.length();i++) {
			char c=cadena.charAt(i);
			if(!Character.isWhitespace(c)) {
				sin=sin+c;
			}
		}
		return sin;
	}
	public static String alReves(String original) {
		String nueva="";
		for(int i=0;i<original.length();i++) {
			nueva=original.charAt(i) + nueva;
		}
		return nueva;
	}
}
