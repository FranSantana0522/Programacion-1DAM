package pack;

import java.util.Scanner;

public class ActividadAmpliacion3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un numero de filas: ");
		int nfilas = sc.nextInt();
		int a=1;
		int b=1;
        for(int filas=0;filas<nfilas;filas++) {
        	for (int col=0;col<filas;col++) {
                 System.out.print(a + "");
                 a=a*(filas-col)/(col+1);
        	}
        	a=b;
        	System.out.println("" + a);
        }
    }
}
