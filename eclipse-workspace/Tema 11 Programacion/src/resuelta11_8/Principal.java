package resuelta11_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio [] tablaSocio=new Socio[4];
		tablaSocio[0]=new Socio("1","pepe");
		tablaSocio[1]=new Socio("11","ana");
		tablaSocio[2]=new Socio("7","pepa");
		tablaSocio[3]=new Socio("23","cris");
		System.out.println(Arrays.deepToString(tablaSocio));
		
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("socios.dat"))){
			out.writeObject(tablaSocio);
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("socios.dat"))){
			tablaSocio=(Socio[])in.readObject();
		}catch(IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(Arrays.deepToString(tablaSocio));
	}

}
