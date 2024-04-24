package pack;

import java.util.Scanner;

public class ActividadResuelta6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String nombre,sinVocales="";
		char c;
		System.out.println("Escriba su nombre completo: ");
		nombre=sc.nextLine();
		for(int i=0;i<nombre.length();i++) {
			c=nombre.charAt(i);
			if(!esVocal(c)) {
				sinVocales=sinVocales+c;
			}
		}
		System.out.println(sinVocales);
		sc.close();
	}
	public static boolean esVocal(char c) {
		boolean result;
		String vocales="aeiouáéíóú";
		c=Character.toLowerCase(c);
		if(vocales.indexOf(c)==-1) {
			result=false;
		}else {
			result=true;
		}
		return result;
	}

}
