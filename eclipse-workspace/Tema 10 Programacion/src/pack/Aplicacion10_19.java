package pack;

import java.io.*;

public class Aplicacion10_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		BufferedWriter out=null;
		try {
			in = new BufferedReader(new FileReader("codec.txt"));
			String linea = in.readLine();
			char[] codificado = new char[linea.length()];
			for (int i = 0; i < linea.length(); i++) {
				codificado[i] = linea.charAt(i);
			}
			in.close();
			char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p',
					'q', 'r', 's', 'u', 'v', 'w', 'x', 'y', 'z' };
			in = new BufferedReader(new FileReader("textoacodificar.txt"));
			String lineas = in.readLine();
			String texto="";
			while (lineas != null) {
				texto+=lineas;
				lineas = in.readLine();
			}
			char[] codificado2 = new char[texto.length()];
			for (int i = 0; i < texto.length(); i++) {
				codificado2[i] = codifica(alfabeto, codificado, texto.charAt(i));
			}
			in.close();
			 out = new BufferedWriter(new FileWriter("textocodificado.txt"));
             out.write(codificado2);
             out.newLine();
             out.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static char codifica(char conj1[], char[] conj2, char c) {
		final String conjunto1 = String.valueOf(conj1);
		char codificado;
		int pos = conjunto1.indexOf(c);
		if (pos == -1) {
			codificado = c;
		} else {
			codificado = conj2[pos];
		}
		return codificado;
	}
}
