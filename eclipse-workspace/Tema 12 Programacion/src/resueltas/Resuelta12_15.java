package resueltas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Resuelta12_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> existencias = new TreeMap<>();
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("existencias.dat"))) {
			existencias = (Map<String, Integer>) in.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		int opcion;
		do {
			System.out.println(
					"1-Alta producto\n2-Baja producto\n3-Cambio stock producto\n4-Listar existencias\n5-Salir");
			opcion = new Scanner(System.in).nextInt();
			switch(opcion) {
			case 1 ->{
				System.out.println("Codigo producto: ");
				String codigo=new Scanner(System.in).next();
				if(!existencias.containsKey(codigo)){
					existencias.put(codigo, 0);
				}else {
					System.out.println("El producto ya existe");
				}
			}
			case 2->{
				System.out.println("Codigo producto: ");
				String codigo=new Scanner(System.in).next();
				existencias.remove(codigo);
			}
			case 3 ->{
				System.out.println("COdigo producto: ");
				String codigo=new Scanner(System.in).next();
				System.out.println("Nuevo stock: ");
				int stock=new Scanner(System.in).nextInt();
				existencias.put(codigo, stock);
			}
			case 4->{
				System.out.println(existencias);
			}
			case 5->{
				System.out.println("Has salido");
				try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("existencias.dat"))){
					out.writeObject(existencias);
				}catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
			default ->{
				System.out.println("Elige opcion correcta");
			}
			}
		} while (opcion != 5);
	}

}
