package pack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ActividadResuelta10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in=null;
		try {
			in=new BufferedReader(new FileReader("Actividad10_4.txt"));
			String texto=in.readLine();
			String[]subcadenas=texto.split(" ");
			double suma=0;
			for(int i=0;i<subcadenas.length;i++) {
				suma+=Double.valueOf(subcadenas[i]);
			}
			System.out.println("Suma: "+suma+"\tMedia: "+suma/subcadenas.length);
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			if(in!=null) {
				try {
					in.close();
				}catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
	}

}
