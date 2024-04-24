package pack;

import java.util.Scanner;

public class ActividadRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nFilas;
		System.out.println("Introduca un lado: ");
		nFilas=sc.nextInt();
		for(int k=1;k<=nFilas;k++) {
			for(int p=1;p<=nFilas+2;p++) {
				System.out.print(" * " + " ");
				
			}
			System.out.println();
		}
		System.out.println(" ");
		System.out.println(" ");
		
		for(int i = 0; i < nFilas+5; i++) {
            System.out.print("*");
        }
        System.out.println();
       
     
        for(int i = 0; i < nFilas-2; i++) {
            System.out.print("*");
            for(int j = 0; j < nFilas+3; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
       
      
        for(int i = 0; i < nFilas+5; i++) {
            System.out.print("*");
        }
			
	}

}
