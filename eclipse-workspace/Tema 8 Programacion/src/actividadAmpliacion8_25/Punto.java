package actividadAmpliacion8_25;

import java.util.Objects;

public class Punto {
	public Integer x,y;

	
	
	
	public Punto(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}


	public double distancia(Punto otroPunto) {
		double distancia;
		x=otroPunto.x-this.x;
		y=otroPunto.y-this.y;
		distancia=Math.pow(x, 2)+Math.pow(y, 2);
		distancia=Math.sqrt(distancia);
		return distancia;
	}
	
	
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Objects.equals(x, other.x) && Objects.equals(y, other.y);
	}
	
	
	
}
