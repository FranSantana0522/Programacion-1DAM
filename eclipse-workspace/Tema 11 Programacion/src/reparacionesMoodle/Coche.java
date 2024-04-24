package reparacionesMoodle;

public class Coche implements Comparable {
	public String mat;
	public String reparacion;
	public Double precio;

	@Override
	public String toString() {
		return "Coche [mat=" + mat + ", reparacion=" + reparacion + ", precio=" + precio + "]";
	}

	public Coche(String mat, String reparacion, Double precio) {
		this.mat = mat;
		this.reparacion = reparacion;
		this.precio = precio;
	}

	public Coche() {
		// TODO Auto-generated constructor stub
	}

	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}

	public String getReparacion() {
		return reparacion;
	}

	public void setReparacion(String reparacion) {
		this.reparacion = reparacion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		double diferencia=this.precio-((Coche)o).precio;
		if(this.mat.equals(((Coche)o).mat)) {
			return (int)diferencia;
		}
		return this.mat.compareTo(((Coche)o).mat);

	}

}
