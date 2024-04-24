package aplicacion;

import java.util.Collection;
import java.util.TreeSet;

public class Aplicacion12_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <Integer> lista=new TreeSet<>();
		Collection <Integer> lista2=new TreeSet<>();
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				lista.add(i);
			}
		}
		System.out.println(lista);
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				lista2.add(i);
			}
		}
		System.out.println(lista2);
		Collection <Integer> lista3=new TreeSet<>();
		lista3.addAll(lista);
		lista3.addAll(lista2);
		System.out.println(lista3);
	}

}
