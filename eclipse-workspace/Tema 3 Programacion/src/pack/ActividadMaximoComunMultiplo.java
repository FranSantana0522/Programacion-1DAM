package pack;

import java.util.Scanner;

public class ActividadMaximoComunMultiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int mcd=1,a,b;
		boolean flag=false;
		int menor;
		System.out.println("Introduce un numero: ");
		a=sc.nextInt();
		System.out.println("Introduce otro numero: ");
		b=sc.nextInt();
		menor=a<b? a:b;
		for(int i=menor;i>=1 &&!flag;i--) {
			if(a%i==0 && b%i==0) {
				mcd=i;
				flag=true;
			}
		}
		System.out.println("El maximo es: " + mcd);
	}

}