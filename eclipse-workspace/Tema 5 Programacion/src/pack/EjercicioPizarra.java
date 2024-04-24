package pack;

import java.util.Scanner;

public class EjercicioPizarra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int longi=10;
		int [] vector={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<longi;i++) {
			System.out.println(vector[i]+" ");
		}
		System.out.println(" ");
		metodo(vector);
		
	}
	static void metodo(int [] tabla) {
		tabla[0]=8;
		tabla[2]=6;
		for(int i=0;i<10;i++) {
			System.out.println(tabla);
		}
	}

}
