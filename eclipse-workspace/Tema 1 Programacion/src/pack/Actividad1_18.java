package pack;

import java.util.Scanner;

public class Actividad1_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int altura;
		int base;
		int area;
		System.out.println("Indica la base: ");
		base=sc.nextInt();
		System.out.println("Indica la altura: ");
		altura=sc.nextInt();
		area= (base*altura)/2;
		System.out.println("El area del triangulo es " + area);
	}

}