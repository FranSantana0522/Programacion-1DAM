package pack;

import java.util.Scanner;

public class Actividadpropuesta2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double aforoMax, numeroEntradas;
		double precio, rebaja, total,rebajareal;
		System.out.println("Indique el aforo total: ");
		aforoMax=sc.nextDouble();
		System.out.println("Indique el numero de entradas total: ");
		numeroEntradas=sc.nextDouble();
		System.out.println("Indique el precio de entradas: ");
		precio=sc.nextDouble();
		if (numeroEntradas<(aforoMax*20)/100)  {
			System.out.println("El concierto se cancela");
			if ((aforoMax*20)/100<numeroEntradas&&numeroEntradas<(aforoMax*50)/100) {
				System.out.println("Se aplica un descuento del 25% ");
				rebaja=(precio*25)/100;
				rebajareal=precio-rebaja;
				total=numeroEntradas*rebajareal;
			    System.out.println("La entrada costaria:" + rebaja + " euros");
			    System.out.println("El total recaudado seria:" + total + " euros");
			    if( (aforoMax*50)/100<numeroEntradas&&numeroEntradas<=aforoMax) {
					total=numeroEntradas*precio;
					System.out.println("El total recaudado seria: " + total + " euros");
				}
			}
			
			
		}
		
		
		
		
	}

}
