package actividadesResueltas8_1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			HoraExacta r=new HoraExacta(11,15,23);
			System.out.println(r);
			for(int i=1;i<=61;i++) {
				r.inc();
			}
			System.out.println(r);
			System.out.println("Escriba unos segundos: ");
			int segundos=sc.nextInt();
			if(r.setSegundos(segundos)) {
				System.out.println(r);
			}else {
				System.out.println("La hora no se puede cambiar");
			}
			HoraExacta a=new HoraExacta(1,2,3);
			HoraExacta b=new HoraExacta(1,2,3);
			HoraExacta c=new HoraExacta(10,20,30);
			System.out.println(a.equals(b));
			System.out.println(a.equals(c));
	}

}
