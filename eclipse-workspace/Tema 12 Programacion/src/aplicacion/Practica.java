package aplicacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Coche> coches = new TreeSet<>();
	/*	coches.add(new Coche("1111AAA","renault","captur","gris plata",0,"12/07/2020"));
		coches.add(new Coche("2222BBB","renault","clio","rojo",0,"21/11/2000"));
		coches.add(new Coche("3333CCC","opel","astra","azul",0,"03/06/2007"));
		coches.add(new Coche("4444DDD","opel","mokka","negro",0,"12/12/2012"));
		coches.add(new Coche("5555EEE","mercedes","clase A","verde",0,"01/09/2014"));
		coches.add(new Coche("6666FFF","mercedes","marco polo","azul",0,"28/08/2014"));
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("coches.dat"))) {
			out.writeObject(coches);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}*/
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("coches.dat"))) {
			coches = (Collection<Coche>) in.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		int opcion;
		do {
			System.out.println("1.Añadir\n2.Eliminar\n3.Mostrar\n4.Mostrar por fecha\n5.Salir");
			opcion = new Scanner(System.in).nextInt();
			switch (opcion) {
			case 1 -> {
				System.out.println("Introduce mat: ");
				String mat = new Scanner(System.in).next();
				System.out.println("Introduce marca: ");
				String mar = new Scanner(System.in).next();
				System.out.println("Introduce modelo: ");
				String mod = new Scanner(System.in).next();
				System.out.println("Introduce color: ");
				String col = new Scanner(System.in).next();
				System.out.println("Introduce kilometrods: ");
				Integer kms = new Scanner(System.in).nextInt();
				System.out.println("Introduce fecha: ");
				String fecha = new Scanner(System.in).next();
				coches.add(new Coche(mat,mar,mod,col,kms,fecha));
			}
			case 2 -> {
				System.out.println("Introduce mat a eliminar: ");
				String mat = new Scanner(System.in).next();
				coches.remove(new Coche(mat));
			}
			case 3 -> {
				System.out.println(coches);
			}
			case 4 -> {
				Comparator <Coche> c=new Comparator<>() {

					@Override
					public int compare(Coche o1, Coche o2) {
						// TODO Auto-generated method stub
						return o1.getFechaMat().compareTo(o2.getFechaMat());
					}
					
				};
				Collection <Coche> cochefecha=new TreeSet<>(c);
				cochefecha.addAll(coches);
				System.out.println(cochefecha);
			}
			case 5 -> {
				try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("coches.dat"))) {
					out.writeObject(coches);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
			default -> {
				System.out.println("Elige correctamente");
			}
			}
		} while (opcion != 5);
	}

}
