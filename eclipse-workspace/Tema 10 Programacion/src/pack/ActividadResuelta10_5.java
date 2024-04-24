package pack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ActividadResuelta10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in=null;
		try {
			in=new BufferedReader(new FileReader("Actividad10_5.txt"));
			Scanner s;
			double numero;
			double suma=0;
			String linea=in.readLine();
			while(linea!=null) {
				s=new Scanner(linea).useLocale(Locale.US);
				if(s.hasNextDouble()) {
					numero=s.nextDouble();
					suma+=numero;	
				}
				linea=in.readLine();	
			}
			System.out.println("Suma: "+suma);
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			if(in!=null) {
				try {
					in.close();
				}catch(IOException ex) {
					System.out.println(ex);
				}
			}
		}
	}

}
