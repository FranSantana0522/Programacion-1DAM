package resueltas;

import java.util.Scanner;

public class Resuelta12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila12_3<Integer> p=new Contenedor12_3<>(new Integer[0]);
		Scanner sc=new Scanner(System.in);
		System.out.println("Introducir enteros positivos (-1 para terminar): ");
		Integer n=sc.nextInt();
		while(n!=-1) {
			p.apilar(n);
			System.out.println("Introducir enteros positivos (-1 para terminar): ");
			n=sc.nextInt();
		}
		System.out.println("Desapilamos");
		n=p.desapilar();
		while(n!=null) {
			System.out.println(n+ " ");
			n=p.desapilar();
		}
		System.out.println(" ");
	}

}
