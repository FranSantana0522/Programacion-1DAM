package resueltas;

import java.util.ArrayList;
import java.util.Collection;

public class Resuelta12_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <Integer> lista=new ArrayList<>();
		for(int i=0;i<100;i++) {
			lista.add((int)(Math.random()*10+1));
		}
		System.out.println(lista);
		Collection <Integer>c=new ArrayList<>();
		c.add(5);
		lista.removeAll(c);
		System.out.println(lista);
	}

}
