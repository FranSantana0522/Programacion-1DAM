package pack;

import java.util.Scanner;

public class ActividadResuelta3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int etiquetaArbolMasAlto;
		int alturaArbolMasAlto;
		int etiqueta=0;
		int altura;
		System.out.println("Altura del arbol(" + etiqueta +"):");
		altura=sc.nextInt();
		alturaArbolMasAlto=altura;
		etiquetaArbolMasAlto=0;
		while (altura !=-1) {
			alturaArbolMasAlto=altura;
			etiquetaArbolMasAlto=etiqueta;
			etiqueta++;
			System.out.print("Altura del arbol (" + etiqueta +")");
			altura=sc.nextInt();
		}
		if (alturaArbolMasAlto == -1) {
			System.out.println("No hay ningun arbol");
		}else {
			System.out.println("El arbol mas alto mide: " + alturaArbolMasAlto);
			System.out.println("Etiqueta del arbol: " + etiquetaArbolMasAlto);
			
		}
		
	}

}
