package pack;

import java.util.Scanner;

public class ActividadRombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nfilas=5;
		for(int filas=1;filas<=nfilas;filas++) {
			for (int col=nfilas;col>filas;col--) {
        		System.out.print(" ");
        	}
			for(int i=0; i<filas;i++) {
				System.out.print("* ");
			}
			System.out.println();
        }
		for (int i=1;i<=nfilas;i++) {
			System.out.print("");
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=nfilas;j>i;j--) {
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
				if(i==1) { 
					System.out.print("*");
				}else if(k==1||k==2*i-1) { 
						System.out.print("*");
					}else { 
						System.out.print(" ");
					}
				
			}
			System.out.println();
			
			}
		
		for(int a=n-1;a>=1;a--) {
			System.out.print("");
			for(int b=0;b<n-a;b++) {
				System.out.print(" ");
			}
			for(int c=1;c<=2*a-1;c++) {
				if(a==1) {
					System.out.print("*");
				}else if(c==1|c==2*a-1){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}	
}

