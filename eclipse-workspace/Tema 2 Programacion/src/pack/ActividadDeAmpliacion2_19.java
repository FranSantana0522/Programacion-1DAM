package pack;

import java.util.Scanner;

public class ActividadDeAmpliacion2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int grados;
		double radianes;
		int n;
		System.out.println("Introduzca los grados de un angulo:");
		grados=sc.nextInt();
		if (grados<0) {
			System.out.println("No hay grados negativos");
		}else if(0<grados && grados<=360) {
			radianes=grados*(Math.PI/180);
			System.out.println("El angulo en radianes es:" + radianes);
		} else if (grados>360){
		n=grados/360;
		grados=grados/n;
		radianes=grados*(Math.PI/180);
		System.out.println("El angulo en radianes es:" + radianes);
		}
		
		
		
	}

}
