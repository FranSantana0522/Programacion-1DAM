package resueltas;

import java.util.HashSet;
import java.util.Set;

public class Resuelta12_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	static <E> Set<E> union(Set<E>conj1,Set<E>conj2){
		Set<E> resultado=new HashSet<>(conj1);
		resultado.addAll(conj2);
		return resultado;
	
	}
	
	static <E> Set<E> interseccion(Set <E> conj1,Set<E> conj2){
		Set <E> interseccion=new HashSet<E>(conj1);
		interseccion.retainAll(conj2);
		return interseccion;
		
	}
}
