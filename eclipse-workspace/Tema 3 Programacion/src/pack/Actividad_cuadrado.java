package pack;

import java.util.Scanner;

public class Actividad_cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Introduzca numero : ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(" * ");
		}
		System.out.println(" ");
		System.out.println(" ");
		
		for (int j=1;j<=n;j++) {
			System.out.println(" * ");
		}
		System.out.println(" ");
		System.out.println(" ");
		for(int k=1;k<=n;k++) {
			for(int p=1;p<=n;p++) {
				System.out.print(" * " + " ");
				
			}
			System.out.println();
		}
		System.out.println(" ");
		System.out.println(" ");
			
		for(int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
       
     
        for(int i = 0; i < n-2; i++) {
            System.out.print("* ");
            for(int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }
       
      
        for(int i = 0; i < n; i++) {
            System.out.print("* ");
        }
			
		
		
		
	}

}
