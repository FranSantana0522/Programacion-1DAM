package actividadAplicacion8_23_24;

public class Rectangulo extends Poligono{
	public double area;
	
	
	
	
	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Rectangulo(double altura, double base) {
		super(altura, base);
		// TODO Auto-generated constructor stub
	}




	@Override
	public double area() {
		// TODO Auto-generated method stub
		area=altura*base;
		return area;
	}

}