package pack;

import java.util.Scanner;

public class ActividadPropuesta5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contCeros = 0;
		int contN = 0;
		int contP = 0;
		int mediaPositivos = 0;
		int mediaNegativos = 0;
		System.err.println("Introduce un numero: ");
		int n = sc.nextInt();
		int n2[] = new int[n];
		for (int i = 0; i < n2.length; i++) {
			System.out.println("Introduce numeros: ");
			n2[i] = sc.nextInt();
			if (n2[i] < 0) {
				mediaNegativos+= n2[i];
				contN++;
			} else if (n2[i] > 0) {
				mediaPositivos+= n2[i];
				contP++;
			} else {
				if (n2[i] == 0) {
					contCeros++;
				}
			}
		}
		if(contN==0) {
			contN=1;
		}
		if(contP==0) {
			contP=1;
		}
		System.out.println("La media de negativos es: " + mediaNegativos / contN);
		System.out.println("La media de positivos es: " + mediaPositivos / contP);
		System.out.println("Hay un total de " + contCeros + " ceros");
	}

}
