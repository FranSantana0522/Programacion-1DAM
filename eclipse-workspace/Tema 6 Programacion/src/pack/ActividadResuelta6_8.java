package pack;

import java.util.Scanner;

public class ActividadResuelta6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String PREFIJO="Javalín, javalón";
		final String SUFIJO="javalén, len, len";
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba una frase: ");
		String entrada=sc.nextLine();
		boolean	idiomaJavalandia=false;
		if(entrada.startsWith(PREFIJO)) {
			idiomaJavalandia=true;
			entrada=entrada.substring(PREFIJO.length());
		}else if(entrada.endsWith(SUFIJO)) {
			idiomaJavalandia=true;
			entrada=entrada.substring(0,entrada.length()-SUFIJO.length());
		}
		if(idiomaJavalandia) {
			entrada=entrada.strip();
			System.out.println(entrada);
		}else {
			System.out.println("No esta escrito en el idioma Javalandia");
		}
		sc.close();
	}

}
