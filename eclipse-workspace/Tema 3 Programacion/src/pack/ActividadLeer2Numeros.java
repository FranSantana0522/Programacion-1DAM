package pack;

import java.util.Scanner;

public class ActividadLeer2Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n, n2;
		int menor;
		int mayor;
		System.out.println("Introduce un numero: ");
		n=sc.nextInt();
		System.out.println("Introduce otro numero: ");
		n2=sc.nextInt();
		
		if(n>n2) {
			mayor=n;
			menor=n2;

		}else {
			mayor=n2;
			menor=n;
		}
			for(int i=menor+1;i<mayor;i++) {
				System.out.println(i);
			}
		
		
		
	}

}
