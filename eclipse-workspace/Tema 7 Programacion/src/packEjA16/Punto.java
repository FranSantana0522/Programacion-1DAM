package packEjA16;

public class Punto {
	private double x;
	private double y;
	private double distancia;

	Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	void desplazaX(double dx) {
		x += dx;
	}

	void desplazaY(double dy) {
		y += dy;
	}

	void desplaza(double dx, double dy) {
		x += dx;
		y += dy;
	}

	double distanciaEuclidea(Punto otro) {
		distancia = Math.sqrt(Math.pow(x - otro.x, 2) + Math.pow(y - otro.y, 2));
		return distancia;
	}

	void muestra() {
		System.out.println("Punto:" + x + "," + y);
	}
}
