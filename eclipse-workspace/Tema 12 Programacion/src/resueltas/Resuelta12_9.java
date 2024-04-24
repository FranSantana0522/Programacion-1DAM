package resueltas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Resuelta12_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> lista=new ArrayList<>();
		System.out.println("Introduce un numero: ");
		Integer n=new Scanner(System.in).nextInt();
		while(n>=0) {
			lista.add(n);
			System.out.println("Introducir numero: ");
			n=new Scanner(System.in).nextInt();
		}
		System.out.println(lista);
		System.out.println("Indice de valores pares: ");
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i)%2==0) {
				System.out.println(i+" ");
				lista.set(i, lista.get(i)*100);
			}
		}
		System.out.println(" ");
		System.out.println(lista);
	}

}
