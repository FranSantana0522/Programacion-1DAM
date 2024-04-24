package pack;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ActividadPropuesta10_3 {
    public static void main(String[] args) {
        try {
            FileReader archivo = new FileReader("Jugadores.txt");
            Scanner scanner = new Scanner(archivo);
            int totalAños = 0;
            double totalAlt = 0.0;
            int contadorJ = 0;

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] datos = linea.split(" ");
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                double estatura = Double.parseDouble(datos[2]);
                System.out.println("Nombre: " + nombre + ", Edad: " + edad + " años, Estatura: " + estatura + " metros");
                totalAños += edad;
                totalAlt += estatura;
                contadorJ++;
            }
            double mediaEdad = (double) totalAños / contadorJ;
            double mediaEstatura = totalAlt / contadorJ;

            System.out.println("Media de Edad: " + mediaEdad + " años");
            System.out.println("Media de Estatura: " + mediaEstatura + " metros");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}