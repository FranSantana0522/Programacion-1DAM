package pack;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Aplicacion10_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader in = null;
        BufferedWriter out = null;
        String[] firmas = new String[0];
        String linea;
        String archivo = "firmas.txt";
        String texto="";
        boolean no = true;
        try {
            in = new BufferedReader(new FileReader(archivo));
            while ((linea = in.readLine()) != null) {
                firmas = Arrays.copyOf(firmas, firmas.length + 1);
                firmas[firmas.length - 1] = linea;
                texto+=linea;
            }
            in.close();
            System.out.println("Introduce tu firma: ");
            String firma = sc.nextLine();
            if (!texto.contains(firma)) {
                out = new BufferedWriter(new FileWriter(archivo, true));
                out.write(firma);
                out.newLine();
                out.close();
            } else {
                System.out.println("La firma ya existe.");
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
