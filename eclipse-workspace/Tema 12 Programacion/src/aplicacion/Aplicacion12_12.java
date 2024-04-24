package aplicacion;

import java.util.Comparator;

public class Aplicacion12_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contenedor12_12 <Integer> lista=new Contenedor12_12<>(new Integer[0]);
		for(int i=0;i<30;i++) {
			lista.insertarFinal((int)(Math.random()*10+1));
		}
		System.out.println(lista);
		Comparator <Integer> c=new Comparator<>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}	
		};
		lista.ordenar(c);
		System.out.println(lista);
	}

}
