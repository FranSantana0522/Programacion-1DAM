package pack;

import java.util.Scanner;

public class HundirLaFlota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tablero = new int[10][10];
		int turnos = 0;
		generarBarcos(2, tablero);		
		generarBarcos(2, tablero);
		generarBarcos(2, tablero);		
		generarBarcos(3, tablero);	
		generarBarcos(3, tablero);	
		generarBarcos(4, tablero);
		// colocarBarcos(tablero);
		mostrarTablero(tablero);
		do {
			tablero = turnosJ(tablero);
			mostrarTablero(tablero);
			turnos++;
		} while (turnos != 30);
		if (turnos == 30) {
			System.out.println("Has perdido");
		}
	}

	public static void generarBarcos(int longi, int[][] tablero) {
		int x = (int) (Math.random() * 9 + 0);
		int y = (int) (Math.random() * 9 + 0);
		int orientacion = (int) (Math.random() * 2 + 1);
		int lado = 0;
		if (x >= 0 && y >= 0) {
			if (orientacion == 1) {
				lado = 1;// derecha
			} else {
				lado = 2;// abajo
			}
		}
		generarPos(x, y, lado, longi, tablero);
	}

	public static void generarPos(int x, int y, int lado, int longi, int[][] tablero) {
		if (lado == 1) {
			if (comprobar(x, y, lado, longi, tablero) == false) {
				for (int i = y; i < y + longi; i++) {

					tablero[x][i] = 1;
				}
			} else {
				generarBarcos(longi, tablero);

			}
		} else if (lado == 2) {
			if (comprobar(x, y, lado, longi, tablero) == false) {
				for (int i = x; i < x + longi; i++) {

					tablero[i][y] = 1;
				}	
			} else {
				generarBarcos(longi, tablero);

			}
		}
	}

	public static boolean comprobar(int x, int y, int lado, int longi, int[][] tablero) {
		int cont = 0;
		if (lado == 1) {
			for (int i = y; i < y + longi && i < 9; i++) {
				if (tablero[x][i] == 0) {
					cont++;
				}
			}

		} else if (lado == 2) {
			for (int i = y; i < y + longi && i < 9; i++) {
				if (tablero[x][i] == 0) {
					cont++;
				}
			}
		}
		if (cont == longi) {
			return true;
		} else {
			return false;
		}
	}

	public static int[][] turnosJ(int[][] tablero) {
		Scanner sc = new Scanner(System.in);
		int posX, posY;
		do {
			System.out.println("Introduce X: ");
			posX = sc.nextInt();
		} while (posX < 0 || posX > 10);
		do {
			System.out.println("Introduce Y: ");
			posY = sc.nextInt();
		} while (posY < 0 || posY > 10);

		if (tablero[posX][posY] == 0) {
			tablero[posX][posY] = -1;
			System.out.println("Agua");
		} else if (tablero[posX][posY] == 1) {
			tablero[posX][posY] = 2;
			System.out.println("Tocado");
		}
		return tablero;
	}

	public static int[][] mostrarTablero(int[][] tablero) {
		int cont = 0;
		System.out.println("  0 1 2 3 4 5 6 7 8 9 Y");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == 0) {
					if (j == 0) {
						System.out.print(i + " * ");
					} else {
						System.out.print("* ");
					}
				} else if (tablero[i][j] == -1) {
					if (j == 0) {
						System.out.print(i + " ~ ");
					} else {
						System.out.print("~ ");
					}
				} else if (tablero[i][j] == 1) {
					if (j == 0) {
						System.out.print(i + " O ");
					} else {
						System.out.print("O ");
					}
				} else if (tablero[i][j] == 2) {
					if (j == 0) {
						System.out.print(i + " X ");
						cont++;
					} else {
						System.out.print("X ");
						cont++;
					}
				}
			}
			System.out.println();
		}
		System.out.println("X");
		System.out.println();
		if (cont == 16) {
			System.out.println("Has Ganado");			
		}
		return tablero;
	}
	/*
	 * static int[][] colocarBarcos(int[][] tablero) { boolean comprobar = false;
	 * //3 barcos de 2 for (int i = 0; i < 3; i++) { // 0=horizontal 1=vertical int
	 * x = (int) (Math.random() * 10 - 1); int y = (int) (Math.random() * 10 - 1);
	 * if (tablero[x][y] == 0) { comprobar = true; int orientacion = (int)
	 * (Math.random() * 2); // comprobar q cabe if (orientacion == 0 && y <
	 * tablero.length - 2) { if (tablero[x][y] == 1) { comprobar = false; } if
	 * (comprobar==true) { for (int j = 0; j < 2; j++) { tablero[x][y + j] = 1; } }
	 * else { // si no puedo poner el barco vuelvo a arriba i--; } } else
	 * if(orientacion == 1 && x < tablero.length - 2){ // orientacion vertical
	 * 
	 * 
	 * if (tablero[x][y] == 1) { comprobar = false; }
	 * 
	 * if (comprobar==true) { for (int j = 0; j < 2; j++) { tablero[x + j][y] = 1; }
	 * } else { i--; } } else { i--; }
	 * 
	 * } } //2 barcos de 3 for (int i = 0; i < 2; i++) { // 0=horizontal 1=vertical
	 * int x = (int) (Math.random() * 10 - 1); int y = (int) (Math.random() * 10 -
	 * 1); if (tablero[x][y] == 0) { comprobar = true; int orientacion = (int)
	 * (Math.random() * 2); // comprobar q cabe if (orientacion == 0 && y <
	 * tablero.length - 3) { if (tablero[x][y] == 1) { comprobar = false; }
	 * 
	 * if (comprobar==true) { for (int j = 0; j < 3; j++) { tablero[x][y + j] = 1; }
	 * } else { // si no puedo poner el barco vuelvo a arriba i--; } } else
	 * if(orientacion == 1 && x < tablero.length - 2){ // orientacion vertical
	 * 
	 * 
	 * if (tablero[x][y] == 1) { comprobar = false; }
	 * 
	 * if (comprobar==true) { for (int j = 0; j < 2; j++) { tablero[x + j][y] = 1; }
	 * } else { i--; } } else { i--; } } } //1 barco de 4 for (int i = 0; i < 1;
	 * i++) { // 0=horizontal 1=vertical int x = (int) (Math.random() * 10 - 1); int
	 * y = (int) (Math.random() * 10 - 1); if (tablero[x][y] == 0) { comprobar =
	 * true; int orientacion = (int) (Math.random() * 2); // comprobar q cabe if
	 * (orientacion == 0 && y < tablero.length - 4) { if (tablero[x][y] == 1) {
	 * comprobar = false; }
	 * 
	 * if (comprobar==true) { for (int j = 0; j < 4; j++) { tablero[x][y + j] = 1; }
	 * } else { // si no puedo poner el barco vuelvo a arriba i--; } } else
	 * if(orientacion == 1 && x < tablero.length - 2){ // orientacion vertical
	 * 
	 * 
	 * if (tablero[x][y] == 1) { comprobar = false; }
	 * 
	 * if (comprobar==true) { for (int j = 0; j < 2; j++) { tablero[x + j][y] = 1; }
	 * } else { i--; } } else { i--; }
	 * 
	 * } } return tablero; }
	 */
}
