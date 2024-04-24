package pack;

import java.util.Scanner;

public class ActividadCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=5;
		for(int a=1;a<=n;a++) {
			for(int b=1;b<=n-a;b++) {
				System.out.print(" ");
			}
			for(int c=1;c<=2*a-1;c++) {
				if(a==1) {
					System.out.print("*");
				}else if(c==1||c==2*a-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int j=0;j<=n-3;j++) {
			System.out.print("* ");
			for(int k=0;k<=n-1;k++) {
				System.out.print(" ");
			}
			System.out.println(" *");
		}
		for(int l=1;l<=n;l++) {
			System.out.print("* ");
		}
		System.out.println();
	}

}
