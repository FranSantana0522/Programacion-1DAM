package propuesta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Propuesta12_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> listaPos=new ArrayList<>();
		Collection<Integer> listaNeg=new ArrayList<>();
		System.out.println("Introduce numeros 0 para salir: ");
		Integer n=new Scanner(System.in).nextInt();
		while(n!=0) {
			if(n>0) {
				listaPos.add(n);
			}
			if(n<0) {
				listaNeg.add(n);
			}
			System.out.println("Introduce numeros 0 para salir: ");
			n=new Scanner(System.in).nextInt();
		}
		System.out.println("Lista positivos: "+listaPos);
		System.out.println("Lista negativos: "+listaNeg);
		for(Iterator<Integer> it=listaPos.iterator();it.hasNext();) {
			n=it.next();
			if(n>10) {
				it.remove();
			}
		}
		System.out.println("Lista positivos menores de 10: "+listaPos);
		for(Iterator<Integer> it=listaNeg.iterator();it.hasNext();) {
			n=it.next();
			if(n<-10) {
				it.remove();
			}
		}
		System.out.println("Lista negativos mayores de -10: "+listaNeg);
	}

}
