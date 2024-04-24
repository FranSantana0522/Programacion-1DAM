package pack;

import java.util.Arrays;

public class ActividadResuelta5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int primitiva(int apuesta[],int [] combinacionGanadora) {
		int aciertos=0;
		for(int a : apuesta) {
			if(Arrays.binarySearch(combinacionGanadora, a)>=0) {
				aciertos++;
			}
		}
		return(aciertos);
	}
}
