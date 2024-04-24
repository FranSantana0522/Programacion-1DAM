package pack;

import java.util.Scanner;

public class ActividadAplicacion4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Numeros de pares que desea mostrar: ");
		int n=sc.nextInt();
		muestraPares(n);
	}
	static void muestraPares(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(2*i);
		}
	}
}
