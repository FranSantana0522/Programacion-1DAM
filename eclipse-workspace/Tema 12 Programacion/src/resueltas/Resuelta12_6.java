package resueltas;

import java.util.ArrayList;
import java.util.Collection;

public class Resuelta12_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			lista.add((int) (Math.random() * 10 + 1));
		}
		System.out.println(lista);
		while (lista.remove(5)) {
			lista.remove(5);
		}
		System.out.println(lista);
	}

}
