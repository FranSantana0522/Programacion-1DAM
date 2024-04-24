package resueltas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Resuelta12_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer>lista=new ArrayList<>();
		for(int i=0;i<20;i++) {
			lista.add((int)(Math.random()*10+1));
		}
		Comparator<Integer> c=Comparator.naturalOrder();
		lista.sort(c);
		System.out.println("Lista original: "+lista);
		Set <Integer> sinrepe=new TreeSet<>();
		sinrepe.addAll(lista);
		System.out.println("Lista sin repetidos: "+sinrepe);
		Set <Integer> repes=new TreeSet<>();
		for(Integer e: sinrepe) {
			lista.remove(e);
		}
		repes.addAll(lista);
		System.out.println("Repetidos: "+repes);
		Set <Integer> unicos=new TreeSet<>();
		unicos.addAll(sinrepe);
		unicos.removeAll(repes);
		System.out.println("Elementos unicos: "+unicos);
	}

}
