package pack;

import java.util.Scanner;

public class ActividadPropuesta3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero;
			System.out.println("Introduzca un numero positivo: ");
			numero=sc.nextInt();
	
		while(numero>0) {
		int unidad = numero%10;
		System.out.println(unidad);
		numero/=10;
		}
		
	}

}
