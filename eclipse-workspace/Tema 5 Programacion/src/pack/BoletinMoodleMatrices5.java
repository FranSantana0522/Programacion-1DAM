package pack;

import java.util.Arrays;
import java.util.Scanner;

public class BoletinMoodleMatrices5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mat[][];
		mat = new int[4][4];
		rellenadatos(mat);
		imprimir(mat);
		boolean compruebaMat = matMagica(mat);
		System.out.println("La matriz es magica: " + compruebaMat);
	}

	public static boolean matMagica(int mat[][]) {
		boolean compruebaMat = false;
		int sumaFilas[] = new int[4];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sumaFilas[i]+=mat[i][j];
			}
		}
		System.out.println("Suma filas: "+Arrays.toString(sumaFilas));
		int sumaCol[] = new int[4];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sumaCol[i]+=mat[j][i];
			}
		}
		System.out.println("Suma columnas: "+Arrays.toString(sumaCol));
		
		int sumaTotalF=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sumaTotalF+=mat[i][j];
			}
		}
		int sumaTotalC=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sumaTotalC+=mat[i][j];
			}
		}
		//Falta arreglar el if un poco mas
		if(sumaTotalF==sumaTotalC) {
			compruebaMat=true;
		}else {
			compruebaMat=false;
		}
		return compruebaMat;
	}
	public static void imprimir(int mat[][]) {
		for (int fila[]:mat) {
			for (int col:fila) {
				System.out.print(col+" ");
			
			}
			System.out.println();
		}
	}
	public static int[][] rellenadatos(int mat[][]) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mat[i][j] = (int) (Math.random() * 2);
			}
		}
		return mat;
	}
}
