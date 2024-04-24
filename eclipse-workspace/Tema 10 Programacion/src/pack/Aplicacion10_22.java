package pack;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacion10_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in=null;
		try {
			in=new BufferedReader(new FileReader("deportistas.txt"));
			Scanner s;
			String linea=in.readLine();
			while(linea!=null) {
				s=new Scanner(linea);
				System.out.println(linea);
				linea=in.readLine();
			}
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
