package pack;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int puntos[] = new int[5];

		for (int i = 0; i > 5; i++) {
			System.out.println("Puntos programador (" + (i + 1) + "): ");
			puntos[i] = sc.nextInt();
		}
		Arrays.sort(puntos);
		System.out.println("Puntuacion: " + Arrays.toString(puntos));

		System.out.println("Puntos del programador de exhibicion: ");
		int puntosProgExh = sc.nextInt();
		while (puntosProgExh != -1) {
			int pos = Arrays.binarySearch(puntos, puntosProgExh);
			int indiceInsercion;
			if (pos < 0) {
				indiceInsercion = pos - 1;
			} else {
				indiceInsercion = pos;
			}
			int copia[] = new int[puntos.length + 1];
			System.arraycopy(puntos, 0, copia, 0, indiceInsercion);
			System.arraycopy(puntos, indiceInsercion, copia, indiceInsercion + 1, puntos.length - indiceInsercion);
			copia[indiceInsercion] = puntosProgExh;
			puntos = copia;

			System.out.println("Puntos del programador de exhibicion: ");
			puntosProgExh = sc.nextInt();
		}
		System.out.println("Puntuacion final: " + Arrays.toString(puntos));
	}

}
