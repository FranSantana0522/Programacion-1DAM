package pack;

import java.util.Scanner;

public class ActividadAmpliacion3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n;
		int raiz=0;
		int i;
		int resto=0;
		do {
			System.out.println("Introduce un numero positivo: ");
			n=sc.nextInt();
		}while(n<=0);
		boolean flag=true;
		for(i=1;i<=n && flag==true;i++) {
			raiz=i*i;
			if (raiz>=n) {
				flag=false;
			}
			
		}
		if(raiz==n) {
			i=i-1;
			System.out.println("La raiz es: "+i);
		}else {
			i=i-2;
			resto=n-(i*i);
			System.out.println("La raiz es: "+ i + " y el resto " + resto);
		}
	}
}
