package pack;

import java.util.Scanner;

public class BoletinRecursividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=2;
		System.out.println("Introduce un numero: ");
		int n=sc.nextInt();
		System.out.println("El "+n+" es primo "+ primo(n,i));
	}
	static boolean primo(int n,int i) {
		boolean primos=true;
		if(i==n) {
			primos=true;
		}else { 
			if((n % i) == 0) {
			primos=false;
		}else {
			primos=primo(n,i+1);
		}}
		return(primos);
	}
}
