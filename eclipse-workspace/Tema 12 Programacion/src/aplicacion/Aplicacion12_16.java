package aplicacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacion12_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Socio12_16> socios = new TreeSet<>();
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {
			socios = (TreeSet<Socio12_16>) in.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		int opcion;
		do {
			System.out.println("1.Alta\n2.Baja\n3.Modificacion\n4.Listado por nombre\n5.Listado por antiguedad\n6.Salir");
			opcion = new Scanner(System.in).nextInt();
			switch (opcion) {
			case 1 -> {
				System.out.println("Dni: ");
				String dni = new Scanner(System.in).next();
				alta(socios, dni);
			}
			case 2 -> {
				System.out.println("Dni socio: ");
				String dni = new Scanner(System.in).next();
				socios.remove(new Socio12_16(dni));
			}
			case 3 -> {
				System.out.println("Dni: ");
				String dni = new Scanner(System.in).next();
				socios.remove(new Socio12_16(dni));
				alta(socios, dni);
			}
			case 4 -> {
				System.out.println(socios);
			}
			case 5 -> {
				Comparator<Socio12_16> c = new Comparator<>() {

					@Override
					public int compare(Socio12_16 o1, Socio12_16 o2) {
						// TODO Auto-generated method stub
						return o2.antiguedad() - o1.antiguedad();
					}
				};
				Set <Socio12_16> s=new TreeSet<>(c);
				s.addAll(socios);
				System.out.println(s);
			}
			case 6 ->{
				try(ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("socios.dat"))){
					out.writeObject(socios);
				}catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
			default ->{
				System.out.println("Elige opcion correcta");
			}
			}
		} while (opcion != 6);
	}

	static boolean alta(Set<Socio12_16> socios, String dni) {
		System.out.println("Nombre: ");
		String nombre = new Scanner(System.in).next();
		System.out.println("Fecha alta: ");
		String fechAlta = new Scanner(System.in).next();
		Socio12_16 nuevo = new Socio12_16(dni, nombre, fechAlta);
		return socios.add(nuevo);
	}
	

}
