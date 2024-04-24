package pack;

import java.util.Scanner;

public class ActividadesAplicacion5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double media, medAr;
		int notas[][];
		notas = new int[3][5];
		notas = notasAlumnos(notas);
		imprimir(notas);
		System.out.println("Media total:" + calcularMediaT(notas));
		medAr = calcularMediaArit(notas);
		System.out.println("Media aritmetica:" + medAr);

	}

	public static void imprimir(int[][] notas) {
		for (int i = 0; i < 3; i++) {
			System.out.println("Trimestre:" + (i + 1));
			for (int j = 0; j < 5; j++) {
				System.out.println("Alumno:" + (i + 1));
				System.out.println(notas[i][j]);
			}
		}
	}

	public static int[][] notasAlumnos(int[][] notas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Introduce notas del trimestre: ");
				notas[i][j] = sc.nextInt();
			}
		}
		return notas;
	}

	public static double calcularMediaT(int[][] notas) {
		double mediaT = 0;
		double media1=0,media2=0,media3=0;
		
			for (int i = 0; i < 5; i++) {
				media1+=notas[0][i];
				media2+=notas[1][i];
				media3+=notas[2][i];
			}
		System.out.println("Media 1 trimestre: "+media1/5);
		System.out.println("Media 2 trimestre: "+media2/5);
		System.out.println("Media 3 trimestre: "+media3/5);
		media1=media1/5;
		media2=media2/5;
		media3=media3/5;
		mediaT=(media1+media2+media3)/3;
		return mediaT;
	}

	public static double calcularMediaArit(int[][] notas) {
		double mediaAr = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				mediaAr+=notas[i][j];
			}
		}
		mediaAr=mediaAr/15;
		return mediaAr;
	}
}
