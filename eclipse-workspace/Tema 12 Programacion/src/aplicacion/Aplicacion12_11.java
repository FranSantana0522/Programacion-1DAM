package aplicacion;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion12_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contenedor12_11 <Integer> lista=new Contenedor12_11<>(new Integer[0]);
		for(int i=0;i<30;i++) {
			lista.insertarFinal((int)(Math.random()*10+1));
		}
		System.out.println(lista);
		lista.ordenar();
		System.out.println(lista);
	}

}
