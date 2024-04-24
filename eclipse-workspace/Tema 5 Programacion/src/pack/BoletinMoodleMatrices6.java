package pack;

import java.util.Scanner;

public class BoletinMoodleMatrices6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Introduce las filas de la matriz");
		n=sc.nextInt();
		System.out.println("Introduce las columnas de la matriz");
		m=sc.nextInt();
		int mat[][] = new int [n][m];
		int mat2[][]=new int [n][m];
		int mat3[][]=new int [n][m];
		mat=introducirValoresMat1(mat);
		mat2=introducirValoresMat2(mat2);
		imprimirMats(mat,mat2);
		mat3=sumaMatrices(mat,mat2,mat3);
		imprimirMat3(mat3);
	}
	
	public static int[][] introducirValoresMat1(int mat[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.println("Introduce los valores de la matriz : ");
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	public static int[][] introducirValoresMat2(int mat2[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<mat2.length;i++) {
			for(int j=0;j<mat2[i].length;j++) {
				System.out.println("Introduce los valores de la segunda matriz : ");
				mat2[i][j]=sc.nextInt();
			}
		}
		return mat2;
	}
    public static void imprimirMats(int mat[][],int mat2[][]) {

		System.out.println("Primera matriz: ");
		for (int fila[] : mat) {
			for (int col : fila) {
				System.out.print(col + " ");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Segunda matriz: ");
		for (int fila[] : mat2) {
			for (int col : fila) {
				System.out.print(col + " ");

			}
			System.out.println();
		}
	}
	public static int [][] sumaMatrices(int mat[][],int mat2[][],int mat3[][]){
		for(int i=0;i<mat3.length;i++) {
			for(int j=0;j<mat3[i].length;j++) {
				mat3[i][j]=mat[i][j]+mat2[i][j];
			}
		}
		return mat3;
	}
	public static void imprimirMat3(int mat3[][]) {
		System.out.println();
		System.out.println("Resultado matriz: ");
		for (int fila[] : mat3) {
			for (int col : fila) {
				System.out.print(col + " ");

			}
			System.out.println();
		}
	}
}
