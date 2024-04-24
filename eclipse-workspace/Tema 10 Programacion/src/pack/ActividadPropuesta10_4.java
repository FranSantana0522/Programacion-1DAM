package pack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActividadPropuesta10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BufferedWriter out=null;
		try {
			out=new BufferedWriter(new FileWriter("Propuesta10_4.txt"));
			String cad;
			do {
			System.out.println("Introduce texto");
			cad=sc.nextLine();
			out.write(cad);
			out.newLine();
			}while(cad.contains("fin.")==false);
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			if(out!=null) {
				try {
					out.close();
				}catch(IOException ex) {
					System.out.println(ex);
				}
			}
		}
	}

}
