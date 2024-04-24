package actividadAplicacion9_13;

import java.util.Objects;

public class Futbolista implements Comparable{
	String dni;
	String nombre;
	Integer edad;
	Integer nGoles;
	
	
	public Futbolista(String dni, String nombre, Integer edad, Integer nGoles) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.nGoles = nGoles;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getnGoles() {
		return nGoles;
	}
	public void setnGoles(Integer nGoles) {
		this.nGoles = nGoles;
	}
	@Override
	public String toString() {
		return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", Goles=" + nGoles + "]\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		return Objects.equals(dni, other.dni);
	}
	@Override
	public int compareTo(Object ob) {
		// TODO Auto-generated method stub
		return dni.compareTo(((Futbolista)ob).dni);
	}
	
	
	
	
	
	
}
