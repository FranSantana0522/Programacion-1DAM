package actividadAplicacion8_23_24;

public abstract class Poligono {
	public double altura,base;
	
	
	public Poligono() {
		super();
	}

	public Poligono(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;

	}

	public abstract double area();

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Poligono [altura=" + altura + ", base=" + base + "]";
	}
	
}
