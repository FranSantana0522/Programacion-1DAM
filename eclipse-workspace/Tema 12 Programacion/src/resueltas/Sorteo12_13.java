package resueltas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sorteo12_13 <T extends Comparable<T>>{
	private final Set<T> elemento;

	public Sorteo12_13() {
		elemento=new TreeSet<>();
	}
	
	boolean add(T nuevo) {
		return elemento.add(nuevo);
	}
	public Set<T> getElemento() {
		return elemento;
	}
	
	Set <T> premiados(int numPremiados){
		Set <T>premiados=null;
		List<T> temp =new ArrayList<>(elemento);
		Collections.shuffle(temp);
		if(numPremiados<=elemento.size()) {
			premiados=new TreeSet<>();
			for(int i=0;i<numPremiados;i++) {
				premiados.add(temp.get(i));
			}
		}
		return premiados;
	}

	@Override
	public String toString() {
		return "Sorteo [Elemento=" + elemento + "]";
	}
	
}
