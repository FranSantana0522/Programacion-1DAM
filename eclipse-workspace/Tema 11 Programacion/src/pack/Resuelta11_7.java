package pack;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Resuelta11_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("numeros.dat"))){
			System.out.println("Introduce numeros: ");
			Scanner s=new Scanner(System.in);
			int numero=s.nextInt();
			while(numero>=0) {
				out.writeInt(numero);
				System.out.println("Introduce numero: ");
				s=new Scanner(System.in);
				numero=s.nextInt();
			}
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		try(ObjectInputStream in =new ObjectInputStream(new FileInputStream("numeros.dat"));
				ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("numerosCopia.dat"))){
			System.out.println("[");
			while(true) {
				int numero=in.readInt();
				System.out.println(numero +" ");
				out.writeInt(numero);
			}
		}catch(EOFException ex) {
			System.out.println("]\nFin de fichero");
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
