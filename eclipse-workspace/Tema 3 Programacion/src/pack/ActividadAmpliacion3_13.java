package pack;

import java.util.Scanner;

public class ActividadAmpliacion3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int h,m,s;
		
		do {
			System.out.println("Introduzca una hora: ");
			h=sc.nextInt();
			
		}while(h>24);
		do {
			System.out.println("Introduzca un minuto: ");
			m=sc.nextInt();
			
		}while(m>60);
		do {
			System.out.println("Introduzca un segundo: ");
			s=sc.nextInt();
			
		}while(s>60);
		System.out.println(h+":"+m+":"+s);
		for (int i=1; i<=10; i++) {
			s=s+1;
			if (h>=24){
				h=0;
			}
			if(m>=60) {
				m=0;
				h++;
			}
			if(s>=60) {
				s=0;
				m++;
			}
			
		}
		System.out.println(h+":"+m+":"+s);
	}

}
