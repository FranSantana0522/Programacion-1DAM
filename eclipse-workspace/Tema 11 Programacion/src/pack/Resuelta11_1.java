package pack;

import java.io.*;

public class Resuelta11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ObjectOutputStream flujoSalida=null;
		try {
			flujoSalida=new ObjectOutputStream(new FileOutputStream("datos.dat"));
			for(int n:t) {
				flujoSalida.writeInt(n);
			}
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

}