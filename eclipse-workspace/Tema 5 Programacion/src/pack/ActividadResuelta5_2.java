package pack;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ActividadResuelta5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.US);
		double t[]=new double [5];
		for(int i=0;i<t.length;i++) {
			System.out.println("Introduce 5 numeros decimales: ");
			t[i]=sc.nextDouble();	
		}
		System.out.println(Arrays.toString(t));
	}

}
