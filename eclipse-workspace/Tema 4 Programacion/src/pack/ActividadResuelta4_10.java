package pack;

import java.util.Scanner;
import java.util.*;
public class ActividadResuelta4_10 {
	static double aElevadoN (double a, int n) {
		double res=1;
		for(int i=1;i<=n;i++) {
			res=res*a;
		}
		return (res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Introduzca base(real): ");
		double base=sc.nextDouble();
		System.out.println("Introduce un exponente(entero no negativo): ");
		int exp=sc.nextInt();
		double res= aElevadoN(base,exp);
		System.out.println(base+ " elevado a " + exp + " = "+res);
	}

}
