package pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ActividadResuelta10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream flujo=null;
		try {
			flujo=new FileInputStream("Actividad10_6.txt");
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		Scanner s=new Scanner(flujo);
		int contador=0;
		int suma=0;	
		while(s.hasNext()) {
			int n=s.nextInt();
			System.out.println(n+" ");
			suma+=n;	
			contador++;
		}
		double media=(double) suma/contador;
		System.out.println("\nSuma: "+suma+"\tMedia: "+media);
	}

}
