package packEjA16;

public class ActividadAplicacion7_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(2, 3);
		Punto p2 = new Punto(1, 1);
		p1.muestra();
		p2.muestra();
		p1.desplazaX(1);
		p2.desplazaY(2);
		p1.muestra();
		p2.muestra();
		p1.desplaza(1, 1);
		p1.muestra();
		System.out.println("Distancia entre los 2 puntos:" + p1.distanciaEuclidea(p2));// IMP COMO MOSTRAR RESULTADOS DE
																						// METODOSs

	}

}
