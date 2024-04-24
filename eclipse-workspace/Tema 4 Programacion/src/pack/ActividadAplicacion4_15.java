package pack;

import java.util.Scanner;

public class ActividadAplicacion4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una hora: ");
		int hora1=sc.nextInt();
		System.out.println("Introduce un minuto: ");
		int minuto1=sc.nextInt();
		System.out.println("Introduce una hora: ");
		int hora2=sc.nextInt();
		System.out.println("Introduce un minuto: ");
		int minuto2=sc.nextInt();
		int resultado=diferenciaMin(hora1,minuto1,hora2,minuto2);
		System.out.println(resultado);
	}
	static int diferenciaMin(int hora1,int minuto1,int hora2, int minuto2) {
		int diferencia;
		minuto1+=hora1*60;
		minuto2+=hora2*60;
		diferencia=minuto1-minuto2;
		return(diferencia);
	}
}
