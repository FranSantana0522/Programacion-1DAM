package aplicacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Aplicacion12_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <Integer> lista=new TreeSet<>();
		for(int i=0;i<20;i++) {
			lista.add((int)(Math.random()*100+1));
		}
		System.out.println(lista);
		
	}

}
