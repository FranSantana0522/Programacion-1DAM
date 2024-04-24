package pack;

import java.util.Scanner;

public class ActividadesAplicacion6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] palabra = { "arroz", "bandeja", "rio", "tormenta", "avioneta", "avestruz", "musgo", "abedul", "reino",
				"manzana", "piedra", "nube", "pizza", "picante", "salado" };
		String adivinar;
		int fallos = 0;
		int a = (int) (Math.random() * 15);
		adivinar = palabra[a];
		String mostrar;
		char[] mostrar2 = new char[adivinar.length()];
		for(int i=0;i<adivinar.length();i++) {
			char b = '_';
			mostrar2[i] = b;
		}
		boolean fallo=false;
		boolean ganar=false;
		do {
			System.out.println("Jugador. Indique una letra: ");
			String letras = sc.next();
			char[] numLetras = letras.toCharArray();
			char c = numLetras[0];
			System.out.println("La letra indicada: " + c);
			mostrar = acertar(adivinar, c, fallos,mostrar2);
			System.out.println(mostrar);
			fallos=nFallos(fallos);
			ahorcado(fallos);
			if(!adivinar.equalsIgnoreCase(mostrar)) {
				ganar=true;
			}
			if(fallos==7) {
				fallo=true;
			}
		} while (ganar==true ||fallo == true);
		if (fallos == 7) {
			System.out.println("Has perdido");
		} else {
			System.out.println("¡Has ganado!");
		}
		sc.close();
	}
	public static String acertar(String adivinar, char c, int fallos,char[] mostrar2) {
		char[] guiones = adivinar.toCharArray();
		for (int i = 0; i < guiones.length; i++) {
			
			if (c == guiones[i]) {
				mostrar2[i] = c;
			} else if(c!=guiones[i]){
				
				fallos=nFallos(fallos);
			}
		}

		return String.valueOf(mostrar2);
	}
	public static int nFallos(int fallos) {
			fallos++;
		
		return fallos;
	}

	public static void ahorcado(int fallos) {
		if (fallos >= 2) {
			System.out.println("__");
		} if (fallos >= 1) {
			System.out.print("|");
			System.out.println("|");
		}if (fallos >= 3) {
			System.out.print("|");
		} if (fallos >= 4) {
			System.out.println("o");
		} if (fallos >= 5) {
			System.out.print("-");
			System.out.print("|");
		} if (fallos >= 6) {
			System.out.println("-");
			if (fallos >= 7) {
				System.out.println(" n");
			}
		}
		System.out.println();
	}
}
