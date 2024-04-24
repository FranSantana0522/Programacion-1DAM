package pack;

import java.util.Arrays;

public class BoletinMoodleMatrices4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]=new int [9][9];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = (int) (Math.random() * (900-500)+500);
			}
		}
		for (int fila[] : mat) {
			for (int col : fila) {
				System.out.print(col + " ");

			}
			System.out.println();
		}
		int []vector=new int [9];
		vector=mostrarDiagonal(mat);
		System.out.println("Diagonal "+Arrays.toString(vector));
		double media=0;
		int max=0,min=1000;
		for(int i=0;i<9;i++) {
			media+=vector[i];
			if(vector[i]>max){
				max=vector[i];
			}
			if(vector[i]<min){
				min=vector[i];
			}
		}
		media=media/vector.length;
		System.out.println("La media es :"+media+"\nEl maximo es :"+max+"\nEl minimo es:"+min);
	}
	public static int[] mostrarDiagonal(int mat[][]) {
		int vector[]=new int[9],escalera=0;
		for(int i=8;i>-1;i--) {
			for(int j=escalera;j<escalera+1;j++) {
				vector[j]=mat[i][j];
			}
			escalera++;
		}
		return vector;
	}
}
