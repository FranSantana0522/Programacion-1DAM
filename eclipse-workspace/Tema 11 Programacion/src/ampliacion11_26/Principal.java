package ampliacion11_26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion;
		Lista tabla = new Lista();
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Registro.dat"))) {
			tabla = (Lista) in.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		do {
			verMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce temperatura maxima: ");
				Double tempMax = sc.nextDouble();
				System.out.println("Introduce temperatura minima: ");
				Double tempMin = sc.nextDouble();
				System.out.println("Introduce fecha: ");
				String fecha = sc.next();
				Registro reg = new Registro(tempMax, tempMin, fecha);
				tabla.insertarFinal(reg);
				break;
			case 2:
				System.out.println(Arrays.toString(tabla.tabla));
				break;
			case 3:
				Double mediaMax=0.0,mediaMin=0.0,mediaVar=0.0;
				for (int i = 0; i < tabla.tabla.length; i++) {
					mediaMax+=((Registro)tabla.tabla[i]).tempMax;
					mediaMin+=((Registro)tabla.tabla[i]).tempMin;
					mediaVar+=((Registro)tabla.tabla[i]).variacion();
				}
				mediaMax=mediaMax/tabla.numeroElementos();
				mediaMin=mediaMin/tabla.numeroElementos();
				mediaVar=mediaVar/tabla.numeroElementos();
				Double max=0.0,min=100.0,medio=0.0;
				for (int i = 0; i < tabla.tabla.length; i++) {
					if(((Registro)tabla.tabla[i]).tempMax>max) {
						max=((Registro)tabla.tabla[i]).tempMax;
					}
					if(((Registro)tabla.tabla[i]).tempMin<min) {
						min=((Registro)tabla.tabla[i]).tempMin;
					}
				}
				medio=max+min;
				medio=medio/2;
				System.out.println("Media de Maximas="+mediaMax+", Media de Minimas="+mediaMin
						+"Media de Variaciones="+mediaVar+"\nLa temperatura maxima es="+max+
						", La temperatura minima es="+min+", El valor medio es="+medio);
				break;

			case 4:
				System.out.println("Has salido");
				try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Registro.dat"))) {
					out.writeObject(tabla);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			default:
				System.out.println("Elige opcion correcta");
				break;
			}
		} while (opcion != 4);
	}

	public static void verMenu() {
		System.out.println("1-Nuevo registro" + "\n2-Mostrar historial" + "\n3-Mostrar estadisticas" + "\n4-Salir");
	}

}
