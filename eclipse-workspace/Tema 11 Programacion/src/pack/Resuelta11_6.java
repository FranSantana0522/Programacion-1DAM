package pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Resuelta11_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("cancionPirata.dat"))){
			String cancion=(String)in.readObject();
			System.out.println(cancion);
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}catch(ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
