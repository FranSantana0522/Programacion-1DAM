package pack;

import java.util.Arrays;

public class ActividadResuelta5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int[] sinRepetidos(int[] t) {
		int temporal[] = new int[0];

		for (int elemento : t) {
			if (Arrays.binarySearch(temporal, elemento) == -1) {
				temporal = Arrays.copyOf(temporal, temporal.length + 1);
				temporal[temporal.length - 1] = elemento;
			}
		}
		return (temporal);
	}
}
