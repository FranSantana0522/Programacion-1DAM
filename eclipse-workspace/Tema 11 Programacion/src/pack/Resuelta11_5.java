package pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Resuelta11_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("datos.dat"))){
			int []tabla= (int []) in.readObject();
			System.out.println(Arrays.toString(tabla));
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}catch(ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}

}