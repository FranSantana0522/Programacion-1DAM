package pack;
import java.util.Scanner;

public class ActividadPropuesto10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduce el nombre, la edad y la estatura en metros separados por espacios: ");
        String linea = scanner.nextLine();
        String[] datos = linea.split(" ");
        String nombre = datos[0];
        int edad = Integer.parseInt(datos[1]);
        double estatura = Double.parseDouble(datos[2]);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Estatura: " + estatura + " metros");
    }
}