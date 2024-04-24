package pack;

import java.util.Scanner;

public class ActividadResuelta6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String antes,despues;
		System.out.println("Escribe una cadena: ");
		antes=sc.nextLine();
		despues=alReves(antes);
		System.out.println(despues);
		sc.close();
	}
	public static String alReves(String original) {
		String nueva="";
		for(int i=0;i<original.length();i++) {
			nueva=original.charAt(i) + nueva;
		}
		return nueva;
	}
}
