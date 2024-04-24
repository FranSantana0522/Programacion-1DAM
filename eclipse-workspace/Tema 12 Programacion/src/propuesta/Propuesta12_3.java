package propuesta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Propuesta12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			lista.add((int) (Math.random() * 10 + 1));
		}
		System.out.println(lista);
		for(Iterator<Integer> it=lista.iterator();it.hasNext();) {
			Integer n=it.next();
			if(n==5) {
				it.remove();
			}
		}
		System.out.println(lista);
	}

}
