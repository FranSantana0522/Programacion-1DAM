package actividadProfExamen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista tabla = new Lista();
		Lista tabla2 = new Lista();
		Lista tabla3=new Lista();
		try (BufferedReader in = new BufferedReader(new FileReader("deportistasAct.txt"))) {
			String linea = in.readLine();
			linea = in.readLine();
			while (linea != null) {
				String name = "";
				Integer edad = 0;
				Double peso = 0.0, altura = 0.0;
				Scanner s = new Scanner(linea).useLocale(Locale.US);
				while (s.hasNext()) {
					if (s.hasNext()) {
						name += s.next()+ " ";
					}
					if (s.hasNextInt()) {
						edad = s.nextInt();
					}
					if (s.hasNextDouble()) {
						peso = s.nextDouble();
					}
					if (s.hasNextDouble()) {
						altura = s.nextDouble();
					}
				}
				linea = in.readLine();
				Deportistas a = new Deportistas(name, edad, altura);
				tabla3.insertarFinal(a);
				Deportistas b = new Deportistas(name, peso);
				if (peso <= 85) {	
					tabla.insertarFinal(b);
				} else {
					tabla2.insertarFinal(b);
				}
				
			}
			System.out.println("Peso ligero: ");
			for(int i=0;i<tabla.tabla.length;i++) {
				System.out.println("[Nombre="+((Deportistas)tabla.tabla[i]).getName()+", Peso="+((Deportistas)tabla.tabla[i]).getPeso()+"]");
			}
			try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Pesoligero.dat"))){
				out.writeObject(tabla);
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println("\nPeso pesado:");
			for(int i=0;i<tabla2.tabla.length;i++) {
				System.out.println("[Nombre="+((Deportistas)tabla2.tabla[i]).getName()+", Peso="+((Deportistas)tabla2.tabla[i]).getPeso()+"]");
			}
			try(ObjectOutputStream out2=new ObjectOutputStream(new FileOutputStream("Pesopesado.dat"))){
				out2.writeObject(tabla2);
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println("\nDeportistas: ");
			for(int i=0;i<tabla3.tabla.length;i++) {
				System.out.println("[Nombre="+((Deportistas)tabla3.tabla[i]).getName()+", Edad="+((Deportistas)tabla3.tabla[i]).getEdad()+", Altura="+((Deportistas)tabla3.tabla[i]).getAltura()+"]");
			}
			try(BufferedWriter out3=new BufferedWriter(new FileWriter("archivo.txt"))){
				for(int i=0;i<tabla3.tabla.length;i++) {
				out3.write(((Deportistas)tabla3.tabla[i]).getName()+" "+((Deportistas)tabla3.tabla[i]).getEdad()+" "+((Deportistas)tabla3.tabla[i]).getAltura());
				out3.newLine();
				}
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		} catch (EOFException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
//leer archivo deportistas(act 10_22)
//Crear clase Deportistas solo con nombre y peso
//Crear clase Deportistas solo nombre, edad y altura
//Meter en un archivo binario los deportistas de la clase con solo nombre y peso, que tengan un peso <=85, 
//meter en otro archivo binario lo contrario
//Meter en un archivo txt los deportistas de la clase con solo nombre, edad y altura
//La clase de deportistas por altura la tienes que ordenar por nombre
