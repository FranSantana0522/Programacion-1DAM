package pack;

import java.io.*;

public class Aplicacion10_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		BufferedReader in2 = null;
		try {
			in = new BufferedReader(new FileReader("textoacodificar.txt"));
			in2 = new BufferedReader(new FileReader("textocodificado.txt"));
			String lineas = in.readLine();
			String lineas2 = in2.readLine();
			String texto = "";
			String texto2 = "";
			while (lineas != null && lineas2 != null) {
				texto += lineas;
				lineas = in.readLine();
				texto2 += lineas2;
				lineas2 = in2.readLine();
			}
			in.close();
			in2.close();
			char[] text = new char[texto.length()];
			for (int i = 0; i < texto.length(); i++) {
				text[i] = texto.charAt(i);
			}
			char[] text2 = new char[texto2.length()];
			for (int i = 0; i < texto2.length(); i++) {
				text2[i] = texto2.charAt(i);
			}
			int cont = 0;
			boolean flag = true;
			for (int i = 0; i < texto.length() && flag == true; i++) {
				if (texto.equals(texto2)) {
					System.out.println("Son iguales");
					flag = false;
				} else if (text[i] != text2[i]) {
					cont++;
					System.out.println("No son iguales\nPrimera diferencia en el " + cont + " caracter");
					flag = false;
				} else if (text[i] == text2[i]) {
					cont++;
				}
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
