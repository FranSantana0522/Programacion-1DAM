package pack;

import java.util.Scanner;

public class BoletinMoodle6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] v = new int[100];
		int longi = 100;
		int n,n2;
		for (int i = 0; i < longi; i++) {
			v[i] = (int) (Math.random() * 20);
			System.out.println(v[i]+" ");
		}
		
			System.out.println("Introduce un valor: ");
			n=sc.nextInt();
			System.out.println("Introduce el valor al que quieres cambiar");
			n2=sc.nextInt();
			
			for(int i=0;i<longi;i++) {
				if(n==v[i]) {
					v[i]=n2;
				}
				System.out.println(v[i]);
			}
		
		}
	}


