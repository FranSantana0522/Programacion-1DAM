package pack;

import java.util.Scanner;

public class ActividadResuelta6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String frase;
		int numEspaciosBlancos=0;
		char c;
		System.out.println("Escriba una frase: ");
		frase=sc.nextLine();
		for(int i=0;i<frase.length();i++) {
			c=frase.charAt(i);
			if(Character.isSpaceChar(c)) {
				numEspaciosBlancos++;
			}
		}
		System.out.println("Tiene: "+numEspaciosBlancos+" espacios en blanco");
		sc.close();
	}

}
