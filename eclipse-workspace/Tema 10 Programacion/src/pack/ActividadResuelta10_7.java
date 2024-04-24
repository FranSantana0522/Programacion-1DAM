package pack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ActividadResuelta10_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter out=null;
		try {
			out=new BufferedWriter(new FileWriter("Quijote.txt"));
			String cad="En un lugar de la mancha";
			for(int i=0;i<cad.length();i++) {
				out.write(cad.charAt(i));
			}
			cad="de cuyo nombre no quiero acordarme";
			out.newLine();
			out.write(cad);
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
