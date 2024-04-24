package pack;

import java.util.Scanner;

public class Actividad1_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		int m;
		int h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa una cantidad de segundos: ");
		s=sc.nextInt();
		m=s/60;
		h=s/3600;
		System.out.println("Hay "+ h +" horas");
		System.out.println("Hay "+ m%60 +" minutos");
		System.out.println("Hay "+ s%3600+" segundos");
		
		
		
		
	}

}
