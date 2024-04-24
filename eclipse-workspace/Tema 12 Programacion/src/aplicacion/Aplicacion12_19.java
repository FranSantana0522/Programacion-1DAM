package aplicacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacion12_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <String> lista=new ArrayList<>();
		System.out.println("Introduzca una frase: ");
		String frase=new Scanner(System.in).nextLine();
		String[] palabras=frase.split(" ");
		Collections.addAll(lista, palabras);
		System.out.println(lista);
		Set <String> sinrepe=new TreeSet<>();
		sinrepe.addAll(lista);
		for(String e:lista) {
			if(!lista.contains(e)) {
				sinrepe.remove(e);
			}
		}
		System.out.println("Sin repetidos: "+sinrepe);
		Set <String> repes=new TreeSet<>();
		for(String e: sinrepe) {
			lista.remove(e);
		}
		repes.addAll(lista);
		System.out.println("Repetidos: "+repes);
	}

}
