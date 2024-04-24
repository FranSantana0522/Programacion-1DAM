package pack;

import java.util.Scanner;

public class ActividadesAplicacion6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		final char conj1[]= {'p','v','i','u','m','t','e','r','k','q','s'};
		final char conj2[]= {'e','i','k','m','p','q','r','s','t','u','v'};
		char codificado[];
		String texto;
		System.out.println("Introduzca un texto a descodificar: ");
		texto=sc.nextLine();
		texto=texto.toLowerCase();
		codificado=new char[texto.length()];
		for(int i=0;i<texto.length();i++) {
			codificado[i]=codifica(conj1,conj2,texto.charAt(i));
		}
		texto=String.valueOf(codificado);
		System.out.println(texto);
		sc.close();
	}
	public static char codifica(char conj1[],char[]conj2,char c) {
		final String conjunto1=String.valueOf(conj1);
		char codificado;
		int pos=conjunto1.indexOf(c);
		if(pos==-1) {
			codificado=c;
		}else {
			codificado=conj2[pos];
		}
		return codificado;
	}
	
}
