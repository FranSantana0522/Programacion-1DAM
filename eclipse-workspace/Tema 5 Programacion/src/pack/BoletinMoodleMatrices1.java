package pack;

import java.util.Arrays;

public class BoletinMoodleMatrices1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = new int[6][10];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = (int) (Math.random() * 1000);
			}
		}
		for (int fila[] : mat) {
			for (int col : fila) {
				System.out.print(col + " ");

			}
			System.out.println();
		}
		int sumaFilas[] = new int[6];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sumaFilas[i] += mat[i][j];
			}
		}
		System.out.println("Suma filas: " + Arrays.toString(sumaFilas));
		int sumaCol[] = new int[10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 6; j++) {
				sumaCol[i] += mat[j][i];
			}
		}
		System.out.println("Suma columnas: " + Arrays.toString(sumaCol));
		int sumaTotal = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sumaTotal += mat[i][j];
			}
		}
		System.out.println("Suma total: " + sumaTotal);

	}

}
