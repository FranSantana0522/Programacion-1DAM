package pack;

import java.util.Scanner;

public class ActividadResuelta4_3 {
	static void  areaVolumenCilindro(double radio,double altura,int opcion) {
		double volumen,area;
		switch(opcion) {
		case 1 ->{
			volumen=Math.PI * Math.pow(radio,2) * altura;
			System.out.println("El volumen es de: " + volumen);
		    }
		case 2 ->{
			area= 2*Math.PI * radio * (altura+radio);
			System.out.println("La area es de: " + area);
			}
		default->System.out.println("Indicador del calculo erroneo");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca radio: ");
		double radio=sc.nextDouble();
		System.out.println("Introduzca altura: ");
		double altura=sc.nextDouble();
		System.out.println("Tipo calculo:\n1 Volumen \n2 Area");
		int opcion=sc.nextInt();
		areaVolumenCilindro(radio,altura,opcion);
	}

}
