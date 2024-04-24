package actividadAplicacion8_13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Unidad[] op = {Unidad.Metros,Unidad.Centimetros};
		Caja c = new Caja();
		System.out.println("Selecciona medida(0-M|1-CM)");
		int o = sc.nextInt();
		switch (op[o]) {
		case Metros:
			System.out.println("Estas introducciendo las medidas en metros ");
			c.setUnidad(op[o]);
			break;
		case Centimetros:
			System.out.println("Estas introducciendo las medidas en centimetros ");
			c.setUnidad(op[o]);
			break;
		}
		System.out.println("Introduce ancho: ");
		double anc=sc.nextDouble();
		c.setAncho(anc);
		System.out.println("Introduce alto: ");
		double alt=sc.nextDouble();
		c.setAlto(alt);
		System.out.println("Introduce fondo: ");
		double fon=sc.nextDouble();
		c.setFondo(fon);
		System.out.println("Introduce etiqueta de la caja: ");
		String eti=sc.next();
		c.setEtiqueta(eti);
		double vol=c.getVolumen(anc, alt, fon);
		c.setVolumen(vol);
		System.out.println(c.toString());
		
		CajaCarton cc=new CajaCarton();
		System.out.println("Cajas de carton siempre son en centimetros");
		System.out.println("Introduce ancho: ");
		double ancC=sc.nextDouble();
		cc.setAncho(ancC);
		System.out.println("Introduce alto: ");
		double altC=sc.nextDouble();
		cc.setAlto(altC);
		System.out.println("Introduce fondo: ");
		double fonC=sc.nextDouble();
		cc.setFondo(fonC);
		System.out.println("Introduce etiqueta de la caja: ");
		String etiC=sc.next();
		cc.setEtiqueta(etiC);
		double volC=cc.getVolumen(ancC, altC, fonC);
		cc.setVolumen(volC);
		double sup=cc.getSuperficie(ancC, altC);
		cc.setSuperficie(sup);
		System.out.println(cc.toString());
		
	}

}
