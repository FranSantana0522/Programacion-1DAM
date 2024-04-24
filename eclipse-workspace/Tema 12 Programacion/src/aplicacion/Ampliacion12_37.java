package aplicacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ampliacion12_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Jugador> futbol = new TreeMap<>();
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("futbolista.dat"))) {
			futbol = (Map<Integer, Jugador>) in.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		int opcion;
		do {
			System.out.println("1.Alta\n2.Eliminar\n3.Mostrar\n4.Mostrar posi\n5.Modificar\n6.Salir");
			opcion = new Scanner(System.in).nextInt();
			switch (opcion) {
			case 1 -> {
				System.out.println("Introduce dorsal: ");
				Integer dorsal = new Scanner(System.in).nextInt();
				altaJugador(futbol, dorsal);
			}
			case 2 -> {
				System.out.println("Introduce dorsal a eliminar: ");
				Integer dorsal = new Scanner(System.in).nextInt();
				System.out.println(eliminarJugador(futbol, dorsal));
			}
			case 3 -> {
				mostrar(futbol);
			}
			case 4 -> {
				System.out.println("Introduce posicion: ");
				String posicion = new Scanner(System.in).next();
				mostrar(futbol, posicion);
			}
			case 5 -> {
				System.out.println("Introduce dorsal: ");
				Integer dorsal=new Scanner(System.in).nextInt();
				System.out.println(editarJugador(futbol,dorsal));
			}
			case 6 -> {
				try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("futbolista.dat"))) {
					out.writeObject(futbol);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
			default -> {
				System.out.println("Elige correctamente");
			}
			}
		} while (opcion != 6);
	}

	static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
		System.out.println("Introduce dni: ");
		String DNI = new Scanner(System.in).next();
		System.out.println("Introduce nombre: ");
		String nombre = new Scanner(System.in).next();
		System.out.println("Introduce posicion: ");
		String posicion = new Scanner(System.in).next();
		System.out.println("Introducir altura: ");
		Double altura = new Scanner(System.in).nextDouble();
		Jugador nuevo = new Jugador(DNI, nombre, PosicionJug.valueOf(posicion), altura);
		plantilla.put(dorsal, nuevo);
	}

	static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
		Jugador eliminado = plantilla.remove(dorsal);
		return eliminado;
	}

	static void mostrar(Map<Integer, Jugador> plantilla) {
		System.out.println(plantilla);
	}

	static void mostrar(Map<Integer,Jugador>plantilla,String posicion) {
		for(Map.Entry<Integer,Jugador> futbols: plantilla.entrySet()) {
			if(futbols.getValue().getPosi().equals(PosicionJug.valueOf(posicion))){
				System.out.println(futbols);
			}
		}
	}
	static boolean editarJugador(Map<Integer,Jugador> plantilla, Integer dorsal) {
		if(plantilla.containsKey(dorsal)) {
			System.out.println("Introduce dni: ");
			String DNI = new Scanner(System.in).next();
			System.out.println("Introduce nombre: ");
			String nombre = new Scanner(System.in).next();
			System.out.println("Introduce posicion: ");
			String posicion = new Scanner(System.in).next();
			System.out.println("Introducir altura: ");
			Double altura = new Scanner(System.in).nextDouble();
			Jugador nuevo=new Jugador(DNI,nombre,PosicionJug.valueOf(posicion),altura);
			plantilla.put(dorsal, nuevo);
			return true;
		}else{
			return false;
		}
		
	}

}
