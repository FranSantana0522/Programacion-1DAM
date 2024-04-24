package pack;

import java.util.Scanner;

public class ActividadMinimoComunMultiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int mcm=0,a,b;
		boolean flag=true;
		int menor;
		int multiplo;
		System.out.println("Introduce un numero: ");
		a=sc.nextInt();
		System.out.println("Introduce otro numero: ");
		b=sc.nextInt();
		menor=a<b? a:b;
		while(menor<=a || menor<=b && flag==true) {
			multiplo=a*menor;
			menor++;
			if(multiplo%a==0 && multiplo%b==0) {
				mcm=multiplo;
				flag=false;
			}
			
		}
		System.out.println("El minimo es: " + mcm);
	}

}
