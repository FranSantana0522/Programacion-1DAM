package pack;

import java.util.Scanner;

public class ActividadCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int op;
		int n,n2;
		boolean salir=true;
		
		while(salir) {
			
		do {
		System.out.println("Escriba una de las opciones \n0(Salir)\n1(Sumar)\n2(Restar)\n3(Multiplicar)\n4(Dividir): ");
		op=sc.nextInt();
		
		}while(op<0 || op>4);{
			
			if (op==0) {
				salir=false;
			}
			
		
			System.out.println("Introduce un numero: ");
			n=sc.nextInt();
			System.out.println("Introduce otro numero: ");
			n2=sc.nextInt();
			
			switch (op) {
			case 1 ->
			System.out.println(n+n2);
			case 2 ->
			System.out.println(n-n2);
			case 3 ->
			System.out.println(n*n2);
			case 4 ->
			System.out.println(n/n2);
			};
		   
		}
	  }
	}

}
