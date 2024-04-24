package pack;

import java.util.Scanner;

public class ActividadResuelta6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String frase,palabra;
		int veces=0,pos;
		System.out.println("Introduce una frase: ");
		frase=sc.nextLine();
		System.out.println("Introduzca una palabra: ");
		palabra=sc.next();
		pos=frase.indexOf(palabra);
		while(pos!=-1) {
			veces++;
			pos=frase.indexOf(palabra,pos+1);
		}
		if(veces==0) {
			System.out.println("\""+palabra+"\"no se encuentra la frase");
		}else {
			System.out.println("\""+palabra+"\" esta "+veces+" veces");
		}
		sc.close();
	}

}
