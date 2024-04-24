package pack;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadesAplicacion5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la clave: ");
		int clave=sc.nextInt();
		System.out.println("Introduce n: ");
		int n=sc.nextInt();
		int t[]=new int [n];
		for(int i=0;i<t.length;i++) {
		System.out.println("Introduce los datos de la tabla: ");
		t[i]=sc.nextInt();
		}
		System.out.println("La clave esta en la posicion: "+buscarTodos(t,clave));
	}

	static int[] buscarTodos(int t[], int clave) {
		int t2[]=new int [0];
		int aux[]=new int[0];
		for(int numero : t) {
			if(numero==clave) {
				aux=Arrays.copyOf(aux, aux.length+1);
				aux[aux.length-1]=numero;
			}
		}
		return(t2);
	}
}
