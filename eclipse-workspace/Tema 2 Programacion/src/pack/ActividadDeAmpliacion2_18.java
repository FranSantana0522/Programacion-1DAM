package pack;

import java.util.Scanner;

public class ActividadDeAmpliacion2_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	int n1;
	int n2;
	int suma;
	int resta;
	int multiplicacion;
	int sumaManual;
	int restaManual;
	int multiplicacionManual;
	int eleccion;
	n1=(int) (Math.random()*100);
	System.out.println("El primer numero aleatorio es: " +n1);
	n2=(int) (Math.random()*100);
	System.out.println("El segundo numero aleatorio es: " +n2);
	suma=n1+n2;
	resta=n1-n2;
	multiplicacion=n1*n2;
	System.out.println("Eliga 1(suma), 2(resta) o 3(multiplicacion)");
	eleccion=sc.nextInt();
	switch (eleccion) {
	case 1 :
		System.out.println("Haga la suma de los dos numeros:");
		sumaManual=sc.nextInt();
		if (sumaManual==suma) {
			System.out.println("La suma es correcta");
		}else {
			System.out.println("La suma es incorrecta");
		}
		break;
	case 2 :
		System.out.println("Haga la resta de los dos numeros:");
		restaManual=sc.nextInt();
		if (restaManual==resta) {
			System.out.println("La resta es correcta");
		}else {
			System.out.println("La recta es incorrecta");
		}
		break;
	case 3 :
		System.out.println("Haga la multiplicacion de lo dos numeros:");
		multiplicacionManual=sc.nextInt();
		if (multiplicacionManual==multiplicacion) {
			System.out.println("La multiplicacion es correcta");
		}else {
			System.out.println("La multiplicacion es incorrecta");
		}
		break;
		
	}
	
	
	
	
	}
}
