package pack;

import java.io.*;

public class Resuelta11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String estrofa="Con diez cañones por banda, \n"
				+ "viento en popa a toda vela, \n"
				+ "no corta el mar, sino vuela \n"
				+ "un velero bergantin.";
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("cancionPirata.dat"))){
			out.writeObject(estrofa);
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("cancionPirata.dat"))){
			System.out.println(in.readObject());
		}catch(IOException|ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
