package aplicacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacion12_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> lista=new ArrayList<>();
		for(int i=0;i<30;i++) {
			lista.add((int)(Math.random()*10+1));
		}
		System.out.println(lista);
		System.out.println(repes((Collection<Integer>) lista));
	}
	static <T> Collection <T> repes(Collection<Integer> lista){
		Collection <T> sinrepes=new TreeSet<T>();
		for(Integer e:lista) {
			if(!sinrepes.contains(e)) {
				sinrepes.add((T) e);
			}
		}
		return (Collection<T>) sinrepes;
	}
}
