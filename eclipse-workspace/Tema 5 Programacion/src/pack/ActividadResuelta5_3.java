package pack;

import java.util.Scanner;

public class ActividadResuelta5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Cuantos numeros desea introducir? ");
		int cN=sc.nextInt();
		int v[]=new int [cN];
		for(int i=0;i<v.length;i++) {
			System.out.println("Introduzca un numero: ");
			v[i]=sc.nextInt();
		}
		System.out.println("Los numeros en orden inverso son: ");
		for(int i=v.length-1;i>=0;i--) {
			System.out.println(v[i]);
		}
	}

}
