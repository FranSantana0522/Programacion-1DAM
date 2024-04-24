package actividadAplicacion9_19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable{
	int id;
	String nombre;
	LocalDate fechaNacimiento;
	
	public Socio(int id, String nombre, String fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento,f);
	}
	int edad() {
		return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}
	/*@Override
	public int compareTo(Object ob) {
		// TODO Auto-generated method stub
		if(edad()==((Socio)ob).edad()) {
			return id-((Socio)ob).id;
		}
		return edad() -(((Socio)ob).edad());	
	}*/
	@Override														
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", edad=" + edad() + "]\n";
	}
	@Override
	public int compareTo(Object ob) {
		// TODO Auto-generated method stub
		return fechaNacimiento.compareTo(((Socio)ob).fechaNacimiento);	
	}
}
 