package packEjA12;

import java.util.Scanner;

public class ActividadAmpliacion7_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		System.out.println("Indica los parametros de la ecuacion de 2º grado: ");
		Ecuacion2Grado ecuacion=new Ecuacion2Grado(a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble());
		ecuacion.resuelve();
		ecuacion.solucion();
	}

}
