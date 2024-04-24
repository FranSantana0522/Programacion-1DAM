package actividadesAplicacion8_16;

import actividadAplicacion8_14.Cola;
import actividadAplicacion8_14.Pila;

public class AcrividadAplicacion7_18_19_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola c = new Cola();
		Pila pila = new Pila();
		c.encolar(2);
		c.encolar(5);
		c.encolar(10);
		c.encolar(-1);
		c.mostrar();
		c.desencolar();
		c.mostrar();
		c.desencolar();
		c.mostrar();

		pila.apilar(3);
		pila.apilar(4);
		pila.apilar(-4);
		pila.mostrar();
		pila.desapilar();
		pila.mostrar();

	}

}
