package pack;

import java.util.Scanner;

public class BoletinRecursividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=1;
		do {
			System.out.println("Introduce un numero ");
			n=sc.nextInt();
		}while(n<0);
		int a=1;
		numero(n,a);
		
	}
	static int numero(int n, int a) {
		boolean flag=true;
		if(a>n) {
			flag=false;
		}else {
			System.out.println(a);
			n=numero(n,a+1);
		}
		return(a);
	}
}