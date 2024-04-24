package actividadAplicacion9_26;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

import actividadAplicacion9_13.Futbolista;

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
	public int compareTo(Object ob2) {
		// TODO Auto-generated method stub
		if(edad()==((Socio)ob2).edad()) {
			return nombre.compareTo(((Socio)ob2).nombre);
		}
		return edad() - ((Socio) ob2).edad();
	}
	public void ordenar() {

	}
	public void ordenar(Comparator c) {
	
	}

	
}
 