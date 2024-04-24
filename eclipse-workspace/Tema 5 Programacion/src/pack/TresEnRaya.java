package pack;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tablero[][] = new int[3][3];
		boolean ganador = false;
		int turnos = 0;
		do {

			verTablero(tablero);
			tablero = turnos1(tablero);
			turnos++;
			ganador = verGanador(tablero, -1);
			if (ganador == true) {
				System.out.println("Ganador jugador 1");
			}
			if (turnos < 9) {
				verTablero(tablero);
				tablero = turnos2(tablero);
				turnos++;
				ganador = verGanador(tablero, 1);
				if (ganador == true) {
					System.out.println("Ganador jugador 2");
				}
			}
			
		} while (turnos < 9 && ganador==false);
		if (ganador == false && turnos==9) {
			System.out.println("Empate");
		}
		verTablero(tablero);
	}

	private static boolean verGanador(int[][] tablero, int n) {
		// TODO Auto-generated method stub
		boolean ganador = false;
		for(int i=0;i<tablero.length;i++) {
			
		}
		for(int i=0;i<tablero.length;i++) {
			
		}
		if(tablero[0][0]==-1 && tablero[1][1]==-1 && tablero[2][2]==-1) {
			ganador=true;
		}else if(tablero[0][2]==-1 && tablero[1][1]==-1 && tablero[2][0]==-1) {
			ganador=true;
		}
		if(tablero[0][0]==1 && tablero[1][1]==1 && tablero[2][2]==1){
			ganador=true;
		}else if(tablero[0][2]==1 && tablero[1][1]==1 && tablero[2][0]==1) {
			ganador=true;
		}
		
		return ganador;
	}

	// Los turnos de los jugadores y posiciones de las fichas
	public static int[][] turnos1(int[][] tablero) {
		Scanner sc = new Scanner(System.in);
		int posicionX = 0;
		int posicionY = 0;
		do {
			do {
				System.out.println("Jugador 1(X) eliga posicion X :");
				posicionX = sc.nextInt();
			} while (posicionX < 1 || posicionX > 3);
			do {
				System.out.println("Jugador 1(X) eliga posicion Y :");
				posicionY = sc.nextInt();
			} while (posicionY < 1 || posicionY > 3);
		} while (ocupado(tablero, posicionX, posicionY, -1) == false);
		return tablero;
	}

	public static int[][] turnos2(int[][] tablero) {
		Scanner sc = new Scanner(System.in);
		int posicionX = 0;
		int posicionY = 0;
		do {
			do {
				System.out.println("Jugador 2(O) eliga posicion X :");
				posicionX = sc.nextInt();
			} while (posicionX < 1 || posicionX > 3);
			do {
				System.out.println("Jugador 2(O) eliga posicion Y :");
				posicionY = sc.nextInt();
			} while (posicionY < 1 || posicionY > 3);
		} while (ocupado(tablero, posicionX, posicionY, 1) == false);

		return tablero;
	}

	// Si el lugar esta ocupado por otra ficha
	public static boolean ocupado(int tablero[][], int posicionX, int posicionY, int n) {
		Scanner sc = new Scanner(System.in);
		boolean ocupado = false;
		if (tablero[posicionX - 1][posicionY - 1] != 0) {
			System.out.println("Posicion ocupada elige otro lugar");
		} else {
			tablero[posicionX - 1][posicionY - 1] = n;
			ocupado = true;
		}

		return ocupado;
	}

	// El tablero de juego
	public static int[][] verTablero(int[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == 0) {
					System.out.print("_ ");
				} else if (tablero[i][j] == -1) {
					System.out.print("X ");
				} else if (tablero[i][j] == 1) {
					System.out.print("O ");
				}

			}
			System.out.println();
		}
		System.out.println();

		return tablero;
	}

}
