package actividadAplicacion8_23_24;

public class Triangulo extends Poligono{
	public double area;
	
	
	
	
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Triangulo(double altura, double base) {
		super(altura, base);
		// TODO Auto-generated constructor stub
	}




	@Override
	public double area() {
		// TODO Auto-generated method stub
		area=altura*base;
		area=area/2;
		return area;
	}

}
