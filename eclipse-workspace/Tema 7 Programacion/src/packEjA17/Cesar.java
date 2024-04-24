package packEjA17;

import java.util.Arrays;

public class Cesar {
	String texto;
	int n;
	static final char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	static String cifrado(String texto, int n) {
		texto = texto.toLowerCase();
		char[] cifrado = texto.toCharArray();
		char[] nuevo = new char[cifrado.length];

		for (int i = 0; i < cifrado.length; i++) {
			int pos;
			if (Character.isAlphabetic(cifrado[i]) == true) {
				pos = Arrays.binarySearch(abecedario, cifrado[i]);
				nuevo[i] = abecedario[pos + n];
			}

		}
		return String.valueOf(nuevo);

	}

}
