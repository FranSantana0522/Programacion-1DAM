package pack;

import java.util.Scanner;

public class Actividad2SerieFinonassi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       
        int a = 0, b = 1, c, n;
       
        System.out.print("Introduzca un numero: ");
        n =sc.nextInt();
       
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
	}

}
