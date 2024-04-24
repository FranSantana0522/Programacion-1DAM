package pack;

import java.util.Scanner;

public class ActividadResuelta3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numSecreto=(int) (Math.random() *100+1);
		System.out.println("Introduzca un numero entre 1 y 100: ");
		int num=sc.nextInt();
		while(numSecreto !=num && num!=-1) {
			if (num > numSecreto) {
				System.out.println("Menor");
			}else {
				System.out.println("Mayor");
			}
			System.out.println("Introduzca otro numero: ");
			num=sc.nextInt();
		}
		if (numSecreto ==num) {
			System.out.println("Enhorabuena...");
		}else {
			System.out.println("Otra vez sera...");
		}
		
	}

}
