package packEj2;

import java.util.Scanner;

public class ActividadResuelta7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Hora h=new Hora();
		System.out.println("Hora: ");
		int valor=sc.nextInt();
		h.setHora(valor);
		System.out.println("Minuto: ");
		valor=sc.nextInt();
		h.setMinuto(valor);
		System.out.println("Segundo:");
		valor=sc.nextInt();
		h.setSegundo(valor);
		System.out.println("Cuantos segundos quiere mostrar: ");
		int numSegundos=sc.nextInt();
		for(int i=0;i<=numSegundos;i++) {
			System.out.println(h.getHora()+":"+h.getMinuto()+":"+h.getSegundo());
			h.incrementaSegundo();
		}
	}

}
