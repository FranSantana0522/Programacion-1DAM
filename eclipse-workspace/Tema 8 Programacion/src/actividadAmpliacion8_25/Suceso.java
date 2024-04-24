package actividadAmpliacion8_25;

import java.util.Objects;

public class Suceso extends Punto3D{
	public Integer tiempo;
	public String descripcion;
	
	
	public Suceso(Integer x, Integer y, Integer z,Integer tiempo) {
		super(x, y, z);
		// TODO Auto-generated constructor stub
		this.tiempo=tiempo;
	}
	public Integer getTiempo() {
		return tiempo;
	}
	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion =descripcion;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Suceso other = (Suceso) obj;
		return Objects.equals(tiempo, other.tiempo);
	}

	@Override
	public String toString() {
		descripcion=super.toString()+", Tiempo="+tiempo+"]";
		return descripcion;
	}
	
	
	
}
