package pack;

public class BoletinMoodleMatrices2 {

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
		maxmin(mat);
	}

	public static void maxmin(int[][] mat) {
		int max=0, min=1000;
		int vector[] = new int[6];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]>max) {
					vector[0]=max;
					vector[1]=i;
					vector[2]=j;
					max=mat[i][j];
				}else if(mat[i][j]<min) {
					vector[3]=min;
					vector[4]=i;
					vector[5]=j;
					min=mat[i][j];
				}
			}
		}
		
		System.out.println("Numero mayor es " + max + " y la posicion es "+vector[1]+","+vector[2]);
		System.out.println("Numero menor es " + min + " y la posicion es "+vector[4]+","+vector[5]);
	}

}
