package actividadAmpliacion8_25;

import java.util.Objects;

public class Punto3D extends Punto{
	public Integer z;

	
	
	public Punto3D(Integer x, Integer y, Integer z) {
		super(x, y);
		this.z=z;
		// TODO Auto-generated constructor stub
	}

	public double distancis(Punto3D otroPunto) {
		double distancia;
		x=otroPunto.x-this.x;
		y=otroPunto.y-this.y;
		z=otroPunto.z-this.z;
		distancia=Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2);
		distancia=Math.sqrt(distancia);
		return distancia;
	}

	
	public Integer getZ() {
		return z;
	}

	public void setZ(Integer z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return super.toString()+", z=" + z + "";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto3D other = (Punto3D) obj;
		return Objects.equals(z, other.z);
	}

	
	
	
	
}
