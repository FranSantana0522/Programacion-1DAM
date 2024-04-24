package pack;

import java.util.Scanner;

public class ActividadNumeroAleatorios10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int contadorMenor=0;
		int contadorMayor=0;
		int contadorIgual=0;
		for(int i=1;i<=10;i++) {
			int num=(int) (Math.random() *100+1);
			System.out.println(num);
			if (num < 50) {
				System.out.println("Menor");
				contadorMenor++;
			}else if(num > 50) {
				System.out.println("Mayor");
				contadorMayor++;
			}
			if (num==50) {
				System.out.println("Igual a 50");
				contadorIgual++;
			}
			
		}
		System.out.println("Menores: " +contadorMenor);
		System.out.println("Mayores: " +contadorMayor);
		System.out.println("Iguales: " +contadorIgual);
	}

}
