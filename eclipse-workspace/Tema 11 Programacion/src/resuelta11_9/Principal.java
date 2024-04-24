package resuelta11_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registro[] reg = new Registro[0];
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("temperaturas.dat"))) {
			reg = (Registro[]) in.readObject();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		int opcion;
		do {
			System.out.println("1-Nuevo registro \n2-Mostrar Historial \n3-Salir \nIntroduce una opcion");
			opcion = new Scanner(System.in).nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introducir temperatura: ");
				double temperatura=new Scanner (System.in).useLocale(Locale.US).nextDouble();
				Registro nuevo =new Registro(temperatura);
				reg=Arrays.copyOf(reg, reg.length+1);
				reg[reg.length-1]=nuevo;
				break;

			case 2:
				System.out.println(Arrays.deepToString(reg));
				break;

			case 3:
				System.out.println("Has salido");
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcion != 3);
		
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("temperaturas.dat"))){
			out.writeObject(reg);
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
