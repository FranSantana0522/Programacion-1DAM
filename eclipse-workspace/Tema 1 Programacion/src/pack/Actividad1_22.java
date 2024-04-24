package pack;

import java.util.Scanner;

public class Actividad1_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h;
		int a;
		int c;
		int totalpatas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de hormigas capturadas: ");
		h=sc.nextInt();
		System.out.println("Cantidad de arañas capturadas: ");
		a=sc.nextInt();
		System.out.println("Cantidad de cochinillas capturadas: ");
		c=sc.nextInt();
		h=h*6;
		a=a*8;
		c=c*14;
		totalpatas=h+a+c;
		System.out.println("Hay un total de " + totalpatas + " de patas ");
		
		
		
		
		
		
		
	}

}
