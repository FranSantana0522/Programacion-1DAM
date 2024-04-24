package aplicacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import resueltas.Academico12_16;

public class Aplicacion12_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Socio12_25> socios = new TreeMap<>();
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("club.dat"))) {
			socios = (Map<String, Socio12_25>) in.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		int opcion;
		do {
			System.out
					.println("1.Alta\n2.Baja\n3.Modificacion\n4.Listado por apodo\n5.Listado por antiguedad\n6.Listado a partir de año\n7.Salir");
			opcion = new Scanner(System.in).nextInt();
			switch (opcion) {
			case 1 -> {
				System.out.println("Apodo: ");
				String apodo = new Scanner(System.in).next();
				alta(socios, apodo);
			}
			case 2 -> {
				System.out.println("Apodo socio: ");
				String apodo = new Scanner(System.in).next();
				socios.remove(new Socio12_16(apodo));
			}
			case 3 -> {
				System.out.println("Apodo: ");
				String apodo = new Scanner(System.in).next();
				socios.remove(new Socio12_16(apodo));
				alta(socios, apodo);
			}
			case 4 -> {
				System.out.println(socios);
			}
			case 5 -> {
				List<Map.Entry<String, Socio12_25>> s = new ArrayList<>(socios.entrySet());
				Collections.sort(s, new Comparator<>() {
					@Override
					public int compare(Entry<String, Socio12_25> o1, Entry<String, Socio12_25> o2) {
						// TODO Auto-generated method stub
						return o1.getValue().antiguedad()-o2.getValue().antiguedad();
					}
				});
				System.out.println(s);
			}

			case 6 -> {
				System.out.println("Introduce fecha: ");
				String fecha=new Scanner(System.in).next();
				LocalDate a=LocalDate.parse(fecha);
				for(Map.Entry<String, Socio12_25> socio: socios.entrySet() ) {
					if(socio.getValue().fechaAlta.compareTo(a)<0) {
						System.out.println(socio);
					}
				}
				
			}
			case 7 -> {
				try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("club.dat"))) {
					out.writeObject(socios);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
			default -> {
				System.out.println("Elige opcion correcta");
			}
			}
		} while (opcion !=7);

	}

	static void alta(Map<String, Socio12_25> socios, String apodo) {
		System.out.println("Dni: ");
		String dni = new Scanner(System.in).next();
		System.out.println("Nombre: ");
		String nombre = new Scanner(System.in).next();
		System.out.println("Fecha alta: ");
		String fechAlta = new Scanner(System.in).next();
		Socio12_25 nuevo = new Socio12_25(dni, nombre, fechAlta);
		socios.put(apodo, nuevo);
		System.out.println("Socio metido correctamente");
	}

}
