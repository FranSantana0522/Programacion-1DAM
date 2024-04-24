package pack;

import java.util.Scanner;

public class ActividadDeAmpliacion2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int DNI, letra;
		System.out.println("Introduzca el DNI: ");
		DNI=sc.nextInt();
		letra=DNI%22;
		switch (letra) {
		case 0 -> System.out.println("La letra es T: " + DNI + "T");
		case 1 -> System.out.println("La letra es R: " + DNI + "R");
		case 2 -> System.out.println("La letra es W: " + DNI + "W");
		case 3 -> System.out.println("La letra es A: " + DNI + "A");
		case 4 -> System.out.println("La letra es G: " + DNI + "G");
		case 5 -> System.out.println("La letra es M: " + DNI + "M");
		case 6 -> System.out.println("La letra es Y: " + DNI + "Y");
		case 7 -> System.out.println("La letra es F: " + DNI + "F");
		case 8 -> System.out.println("La letra es P: " + DNI + "P");
		case 9 -> System.out.println("La letra es D: " + DNI + "D");
		case 10-> System.out.println("La letra es X: " + DNI + "X");
		case 11-> System.out.println("La letra es B: " + DNI + "B");
		case 12-> System.out.println("La letra es N: " + DNI + "N");
		case 13-> System.out.println("La letra es J: " + DNI + "J");
		case 14-> System.out.println("La letra es Z: " + DNI + "Z");
		case 15-> System.out.println("La letra es S: " + DNI + "S");
		case 16-> System.out.println("La letra es Q: " + DNI + "Q");
		case 17-> System.out.println("La letra es V: " + DNI + "V");
		case 18-> System.out.println("La letra es H: " + DNI + "H");
		case 19-> System.out.println("La letra es L: " + DNI + "L");
		case 20-> System.out.println("La letra es C: " + DNI + "C");
		case 21-> System.out.println("La letra es K: " + DNI + "K");
		case 22-> System.out.println("La letra es E: " + DNI + "E");
		}
		
	
	
	}

}
