package pack;

import java.util.Scanner;

public class Actividad1_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double metros;
		double centimetros;
		double metrostruncados;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa la distancia lanzada(metros): ");
		metros=sc.nextDouble();
		metrostruncados=Math.ceil(metros);
		centimetros=metrostruncados*100;
		System.out.println("La distancia lanzada es de " +centimetros +" centimetros");
		
		
		
		
		
		
		
		
	}

}
