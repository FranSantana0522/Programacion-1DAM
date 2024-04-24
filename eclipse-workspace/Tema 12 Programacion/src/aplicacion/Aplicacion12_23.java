package aplicacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Aplicacion12_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <String> lista=new TreeSet <>();
		String p="";
		while(!p.equals("fin")) {
			System.out.println("Introduce una palabra");
			p=new Scanner(System.in).next();
			if(!p.equals("fin")) {
				lista.add(p);
			}
		}
		System.out.println(lista);
	}

}
