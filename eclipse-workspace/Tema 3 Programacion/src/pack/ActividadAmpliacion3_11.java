package pack;

import java.util.Scanner;

public class ActividadAmpliacion3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int decimal, exp,digito;
		int binario;
		do {
		System.out.println("Introduzca un numero: ");
		decimal=sc.nextInt();
		}while(decimal<0);
		exp=0;
		binario=0;
		while(decimal!=0) {
			digito=decimal%2;
			binario= (int) (binario+digito*Math.pow(10, exp));
			exp++;
			decimal=decimal/2;
			System.out.println(binario);
		}
		
	}

}
