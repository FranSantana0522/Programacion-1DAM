package pack;

import java.util.Scanner;

public class ActividadResuelta4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce primer numero: ");
		int a=sc.nextInt();
		System.out.println("Introduce segundo numero: ");
		int b=sc.nextInt();
		int resultado=mcd(a,b);
		System.out.println("El mcd es: " + resultado);
	}
		static int mcd (int a,int b) {
		int resultado;
		if (a==0) {
			resultado=b;
		}else if(b==0) {
			resultado=a;
		}else {
			int min= a<=b? a:b;
			int max= a<=b? b:a;
			resultado=mcd(min,max-min);
		}
		return(resultado);
		}
  
}
