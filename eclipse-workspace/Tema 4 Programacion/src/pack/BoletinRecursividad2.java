package pack;

import java.util.Scanner;

public class BoletinRecursividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce un numero ");
		int a=sc.nextInt();
		System.out.println("Introduce otro numero ");
		int b=sc.nextInt();
		int multiplicacion=multiplicar(a,b);
		System.out.println("El resultado es: "+multiplicacion);
	}
	static int multiplicar(int a, int b) {
		int multiplicacion=0;
		if(b==0) {
			multiplicacion=0;
		}else {
			multiplicacion=a+multiplicar(a,b-1);
		}
		return(multiplicacion);
	}
}
