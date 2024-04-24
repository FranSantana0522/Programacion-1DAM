package reparacionesMoodle;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion;
		Coche car;
		TablaTaller taller = new TablaTaller();
		String mat, repa;
		Double pre;

		try (BufferedReader in = new BufferedReader(new FileReader("taller.txt"))) {
			Scanner s;
			String mat2 = "", repa2 = "";
			Double pre2 = 0.0;
			String linea = in.readLine();
			while (linea != null) {
				mat2 = linea;
				linea = in.readLine();
				repa2 = linea;
				linea = in.readLine();
				s = new Scanner(linea).useLocale(Locale.US);
				if (s.hasNextDouble()) {
					pre2 = s.nextDouble();
				}
				linea = in.readLine();
				if (linea.equals("*")) {
					linea = in.readLine();
					car = new Coche(mat2, repa2, pre2);
					taller.insertar(car);
				} else {
					car = new Coche(mat2, repa2, pre2);
					taller.insertar(car);
					repa2 = linea;
					linea = in.readLine();
					s = new Scanner(linea).useLocale(Locale.US);
					if (s.hasNextDouble()) {
						pre2 = s.nextDouble();
					}
					car = new Coche(mat2, repa2, pre2);
					taller.insertar(car);
					in.readLine();
					linea = in.readLine();
				}

			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		do {
			verMenu();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduce la matrícula: ");
				mat = sc.next();
				System.out.println("Introduce la reparación: ");
				repa = sc.next();
				System.out.println("Introduce el precio: ");
				pre = sc.nextDouble();
				car = new Coche(mat, repa, pre);
				taller.insertar(car);
				break;

			case 2:
				Arrays.sort(taller.tabla);
				System.out.println(taller.toString());
				break;

			default:
				System.out.println("Has salido");
				try (BufferedWriter out = new BufferedWriter(new FileWriter("taller.txt"))) {
					for (int i = 0; i < taller.tabla.length; i++) {
						if (i == taller.tabla.length - 1) {
							if(taller.tabla[i].mat==taller.tabla[i-1].mat) {
								out.write(taller.tabla[i].reparacion + "\n"
										+ taller.tabla[i].precio + "\n* ");
							}else {
								out.write(taller.tabla[i].mat + "\n" + taller.tabla[i].reparacion + "\n"
										+ taller.tabla[i].precio + "\n* ");
							}
						} else {
							if (taller.tabla[i].mat == taller.tabla[i + 1].mat) {
								out.write(taller.tabla[i].mat + "\n" + taller.tabla[i].reparacion + "\n"
										+ taller.tabla[i].precio+"\n");
							} else {
								out.write(taller.tabla[i].mat + "\n" + taller.tabla[i].reparacion + "\n"
										+ taller.tabla[i].precio + "\n* ");
								out.newLine();
							}
						}
					}
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
		} while (opcion > 0 && opcion < 3);
	}

	public static void verMenu() {
		System.out.println("1. Alta de reparación.\n2. Listado ordenado por matrícula.\n3. Salir");
	}
}
