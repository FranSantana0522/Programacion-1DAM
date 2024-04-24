package pack;

import java.util.Scanner;

public class ActividadAmpliacion3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nfilas;
		System.out.println("Introduce numero lineas: ");
		nfilas=sc.nextInt();
		for(int filas=1;filas<=nfilas;filas++) {
			for (int col=nfilas;col>filas;col--) {
        		System.out.print(" ");
        	}
			for(int i=0; i<filas;i++) {
				System.out.print("* ");
			}
			System.out.println();
        }
		System.out.println();
		int n=5; 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) { 
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k++) { 
				if(i==1||i==n) { 
					System.out.print("*");
				}else if(k==1||k==2*i-1) { 
						System.out.print("*");
					}else { 
						System.out.print(" ");
					}
				
			}
			System.out.println();
		}

	}	
	

}
